package spark.Lambda;

import spark.Request;
import spark.Response;

/**
 * Created by shpatnaik on 4/21/14.
 * This is used to provide support for lambdas for the Spark Framework
 */
@FunctionalInterface
public interface RouteLambda {
    public Object handle(Request request, Response response);
}
