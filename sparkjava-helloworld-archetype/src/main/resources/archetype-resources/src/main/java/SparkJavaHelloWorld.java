package ${package};

import static spark.Spark.*;
import spark.Route;
import spark.Request;
import spark.Response;


public class SparkJavaHelloWorld {
    public static void main(String[] args) {

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });

    }
}