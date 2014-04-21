# Spark Lambda

-----------------------------------------
> **Overview**
>
> This is an example of how the new Java 8 Lambda Expressions can be using with the spark framework in order to make the code a little more concise.

**Getting Started**

    import static spark.Lambda.SparkLambda.*;

    public class Sample {
        public static void main(String[] args) {
            get("/", (request, response) -> "Hello Lambda");
        }
    }