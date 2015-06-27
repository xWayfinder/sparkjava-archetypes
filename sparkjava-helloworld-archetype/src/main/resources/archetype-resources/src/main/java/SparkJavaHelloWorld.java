#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static spark.Spark.*;

public class SparkJavaHelloWorld {

  public static void main(String[] args) {
    get("/hello", (req, res) -> {
      return "Hello World!";
    });
  }

}