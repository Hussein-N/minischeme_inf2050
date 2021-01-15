package minischeme;

import minischeme.parser.api.Parser;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Classe principale minischeme.Application.
 * La classe doit être exécutée lorsqu'on exécute l'archive
 * JAR sur la ligne de commande:
 * $ java -jar target/minischeme.jar exemples/facto.json
 *
 * @author  François-Xavier Guillemette
 * @author multiTeQ_INF2050-30-H2020
 * @version 1.1
 * @since   2020-05-09
 */
public class Application {

  /**
   * La méthode publique main est la porte d'entrée au programme.
   * On crée un fichier .log pour enregistrer le résultat affiché à l'écran.
   * On utilise le fichier .log lors des test unitaires.
   * @param args L'unique paramètre qui est le chemin vers le fichier JSON.
   * Affiche à l'écran le résultat du programme minischeme.
   */
  public static void main(final String... args) throws Exception {
    var code = (List<Object>) Parser.parseString(new String(Files.readAllBytes(
            Paths.get(args[0])), StandardCharsets.UTF_8));
    Object result = new Evaluator().eval(code, GlobalEnvironment.build());
    System.out.println(result.toString());
    FileWriter fileLog = new FileWriter(".log", StandardCharsets.UTF_8);
    fileLog.write(result.toString());
    fileLog.close();
  }
}