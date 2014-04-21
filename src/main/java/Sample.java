import static spark.Lambda.SparkLambda.*;

/**
 * Created by shpatnaik on 4/21/14.
 * This is a sample program to show a Hello World Example
 */
public class Sample {

    public static void main(String[] args) {
        get("/", (request, response) -> "Hello Lambda");
    }
}
