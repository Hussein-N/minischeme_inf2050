package minischeme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import org.apache.commons.math3.util.Precision;

public class GlobalEnvironment {

  public static Map<String, Object> build() {
    var env = new HashMap<String, Object>();

    env.put("begin", (Procedure) (List<Object> params) -> {
      return params.get(params.size() - 1);
    });

    env.put("*", (Procedure) (List<Object> params) -> {
      var product = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) product *= (Double) x;
      return product;
    });

    env.put("<", (Procedure) (List<Object> params) -> {
      var result = true;
      for (int i = 0; i < params.size()-1; i++) result = result && (Double) params.get(i) < (Double) params.get(i+1);
      return result;
    });

    env.put("+", (Procedure) (List<Object> params) -> {
      var result = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) result += (Double) x;
      return result;
    });

    env.put("-", (Procedure) (List<Object> params) -> {
      var result = (Double) params.get(0);
      for (Object x : params.subList(1, params.size())) result -= (Double) x;
      return result;
    });

    env.put("and", (Procedure) (List<Object> params) -> {
      var result = (Boolean) params.get(0);
      for (Object x : params.subList(1, params.size())) {
        result &= (Boolean) x;
      }
      return result;
    });

    env.put("not", (Procedure) (List<Object> params) -> {
      return !(Boolean) params.get(0);
    });

    env.put("eq", (Procedure) (List<Object> params) -> {
      var result = (Boolean) true;
      var element0 = Precision.round((Double) params.get(0), 2);
      int i = 0;
      while (i < params.size() && result.equals(true)) {
        if (element0 != Precision.round((Double) params.get(i), 2)) {
          result = false;
        }
        i++;
      }
      return result;
    });

    env.put("count", (Procedure) (List<Object> params) -> {
      Double valDouble = Double.valueOf(((List<Object>) params.get(0)).size());
      return valDouble;
    });

    env.put("head", (Procedure) (List<Object> params) -> {
      return ((List<Object>) params.get(0)).get(0);
    });

    env.put("tail", (Procedure) (List<Object> params) -> {
      var listElements = (List<Object>) params.get(0);
      return listElements.subList(1, listElements.size());
    });

    env.put("append", (Procedure) (List<Object> params) -> {
      var concat = new ArrayList<Object>();
      for (int i = 0; i < params.size(); i++) concat.addAll((List<Object>) params.get(i));
      return concat;
    });

    env.put("filter", (Procedure) (List<Object> params) -> {
      var fn = (Procedure) params.get(0);
      var xs = (List<Object>) params.get(1);
      return xs.stream().filter(x -> (boolean) fn.call(List.of(x))).collect(toList());
    });

    return env;
  }
}
