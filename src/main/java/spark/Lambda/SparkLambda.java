package spark.Lambda;

import spark.*;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Created by shpatnaik on 4/21/14.
 * This is a wrapper around the Spark Framework to provide support for Lambdas
 */
public final class SparkLambda {

    private SparkLambda() {
    }

    /**
     * This calls the Spark GET function with the provided Route and Lambda
     * @param route This is a string with the expression for the matching route
     * @param lambda The lambda expression to handle the route
     */
    public static void get(String route, BiFunction<Request, Response, Object> lambda) {

        // Create a new Spark route.
        Spark.get(new Route(route) {
            @Override
            public Object handle(Request request, Response response) {
                return lambda.apply(request, response);
            }
        });
    }

    /**
     * This calls the Spark POST function with the provided Route and Lambda
     * @param route This is a string with the expression for the matching route
     * @param lambda The lambda expression to handle the route
     */
    public static void post(String route, BiFunction<Request, Response, Object> lambda) {

        // Create a new Spark route.
        Spark.post(new Route(route) {
            @Override
            public Object handle(Request request, Response response) {
                return lambda.apply(request, response);
            }
        });
    }

    /**
     * This calls the Spark PUT function with the provided Route and Lambda
     * @param route This is a string with the expression for the matching route
     * @param lambda The lambda expression to handle the route
     */
    public static void put(String route, BiFunction<Request, Response, Object> lambda) {

        // Create a new Spark route.
        Spark.put(new Route(route) {
            @Override
            public Object handle(Request request, Response response) {
                return lambda.apply(request, response);
            }
        });
    }

    /**
     * This calls the Spark DELETE function with the provided Route and Lambda
     * @param route This is a string with the expression for the matching route
     * @param lambda The lambda expression to handle the route
     */
    public static void delete(String route, BiFunction<Request, Response, Object> lambda) {

        // Create a new Spark route.
        Spark.delete(new Route(route) {
            @Override
            public Object handle(Request request, Response response) {
                return lambda.apply(request, response);
            }
        });
    }

    /**
     * This calls the Spark OPTIONS function with the provided Route and Lambda
     * @param route This is a string with the expression for the matching route
     * @param lambda The lambda expression to handle the route
     */
    public static void options(String route, BiFunction<Request, Response, Object> lambda) {

        // Create a new Spark route.
        Spark.options(new Route(route) {
            @Override
            public Object handle(Request request, Response response) {
                return lambda.apply(request, response);
            }
        });
    }

    /**
     * This calls the Spark HEAD function with the provided Route and Lambda
     * @param route This is a string with the expression for the matching route
     * @param lambda The lambda expression to handle the route
     */
    public static void head(String route, BiFunction<Request, Response, Object> lambda) {

        // Create a new Spark route.
        Spark.head(new Route(route) {
            @Override
            public Object handle(Request request, Response response) {
                return lambda.apply(request, response);
            }
        });
    }

    /**
     * This calls the Spark PATCH function with the provided Route and Lambda
     * @param route This is a string with the expression for the matching route
     * @param lambda The lambda expression to handle the route
     *
     */
    public static void patch(String route, BiFunction<Request, Response, Object> lambda) {

        // Create a new Spark route.
        Spark.patch(new Route(route) {
            @Override
            public Object handle(Request request, Response response) {
                return lambda.apply(request, response);
            }
        });
    }

    /**
     * This calls the Spark Before Filter function with the provided Lambda expression for the filter
     * @param lambda The lambda expression to handle the route
     *
     */
    public static void before(BiConsumer<Request, Response> lambda) {
        Spark.before(new Filter() {
            @Override
            public void handle(Request request, Response response) {
                lambda.accept(request, response);
            }
        });
    }

    /**
     * This calls the Spark After Filter function with the provided Lambda expression for the filter
     * @param lambda The lambda expression to handle the route
     */
    public static void after(BiConsumer<Request, Response> lambda) {
        Spark.after(new Filter() {
            @Override
            public void handle(Request request, Response response) {
                lambda.accept(request, response);
            }
        });
    }

    /**
     * This calls the Spark Before Filter function with the provided Lambda expression for the filter and the pattern
     * @param pattern The pattern to match for the filter
     * @param lambda The lambda expression to handle the route
     *
     */
    public static void before(String pattern, BiConsumer<Request, Response> lambda) {
        Spark.before(new Filter(pattern) {
            @Override
            public void handle(Request request, Response response) {
                lambda.accept(request, response);
            }
        });
    }

    /**
     * This calls the Spark After Filter function with the provided Lambda expression for the filter and the pattern
     * @param pattern The pattern to match for the filter
     * @param lambda The lambda expression to handle the route
     *
     */
    public static void after(String pattern, BiConsumer<Request, Response> lambda) {
        Spark.after(new Filter(pattern) {
            @Override
            public void handle(Request request, Response response) {
                lambda.accept(request, response);
            }
        });
    }
}
