package minischeme.parser;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import minischeme.Application;
import minischeme.parser.api.*;
import org.junit.jupiter.api.*;


@SuppressWarnings("unchecked")
class MinischemeParserTests {

  @Test
  @DisplayName("Parses lists of atoms")
  void listOfAtoms() throws Exception {
    var source = "(+ 1.0 2.0 3.0)";

    var parsed = (List<Object>) Parser.parseString(source);

    assertEquals(4, parsed.size());
    assertEquals("+", (String) parsed.get(0));
    assertEquals(1.0d, (double) parsed.get(1));
    assertEquals(2.0d, (double) parsed.get(2));
    assertEquals(3.0d, (double) parsed.get(3));
  }

  @Test
  @DisplayName("Parses boolean values")
  void booleanTest() throws Exception {
    var source = "(and #t #f)";

    var parsed = (List<Object>) Parser.parseString(source);

    assertEquals(3, parsed.size());
    assertTrue((boolean) parsed.get(1));
    assertFalse((boolean) parsed.get(2));
  }

  @Test
  @DisplayName("Parses lists of lists")
  void listOfLists() throws Exception {
    var source = "(begin (define x (+ 1 2)) (< x 10))";

    var parsed = (List<Object>) Parser.parseString(source);

    assertEquals(3, parsed.size());
    assertEquals("begin", (String) parsed.get(0));

    var define = (List<Object>) parsed.get(1);
    assertEquals(3, define.size());
    assertEquals("define", (String) define.get(0));

    var sum = (List<Object>) define.get(2);
    assertEquals(3, sum.size());
    assertEquals("+", (String) sum.get(0));
    assertEquals(1.0d, (double) sum.get(1));
    assertEquals(2.0d, (double) sum.get(2));

    var lessThan = (List<Object>) parsed.get(2);
    assertEquals(3, lessThan.size());
    assertEquals("<", (String) lessThan.get(0));
    assertEquals("x", (String) lessThan.get(1));
    assertEquals(10.0d, (double) lessThan.get(2));
  }

  @Test
  @DisplayName("Numbers that could also be symbols are treated as numbers")
  void possiblyAmbiguous() throws Exception {
    var source = "(+ +1.0 +2.0)";

    var parsed = (List<Object>) Parser.parseString(source);

    assertEquals(3, parsed.size());
    assertEquals("+", (String) parsed.get(0));
    assertEquals(1.0d, (double) parsed.get(1));
    assertEquals(2.0d, (double) parsed.get(2));
  }

  @Test
  @DisplayName("Comments intermingled with code")
  void comments() throws Exception {
    var source =
        ";; start of line comment\n"
      + "(begin ;; end of line comment\n"
      + "(+ 1 2)) ;; end of file comment"
      ;

    var parsed = (List<Object>) Parser.parseString(source);

    assertEquals(2, parsed.size());
    assertEquals("begin", (String) parsed.get(0));

    var expr = (List<Object>) parsed.get(1);

    assertEquals(3, expr.size());
    assertEquals("+", (String) expr.get(0));
    assertEquals(1.0d, (double) expr.get(1));
    assertEquals(2.0d, (double) expr.get(2));
  }

  @Test
  @DisplayName("parser String method")
  void parseString() throws Exception {
    Path pathJSON = Paths.get("src/main/resources/count.json");

    var parsed = (List<Object>) Parser.parseString(new String(Files.readAllBytes(pathJSON), StandardCharsets.UTF_8));

    assertEquals(2, parsed.size());
    assertEquals("begin", (String) parsed.get(0));

    var expr = (List<Object>) parsed.get(1);

    assertEquals(2, expr.size());
    assertEquals("count", (String) expr.get(0));

    var exprList = (List<Object>) expr.get(1);

    assertEquals(7, exprList.size());
    assertEquals("list", (String) exprList.get(0));
    assertEquals(1.0d, (double) exprList.get(1));
    assertEquals(2.0d, (double) exprList.get(2));
    assertEquals(3.0d, (double) exprList.get(3));
    assertEquals(4.0d, (double) exprList.get(4));
    assertEquals(5.0d, (double) exprList.get(5));
    assertEquals(6.0d, (double) exprList.get(6));
  }

  @Test
  @DisplayName("main method")
  void mainTest() throws Exception {
    String pathJSON = "src/main/resources/count.json";
    Path fileLog = Paths.get(".log");

    Application.main(pathJSON);

    assertEquals("6.0", new String(Files.readAllBytes(fileLog), StandardCharsets.UTF_8));
  }
}