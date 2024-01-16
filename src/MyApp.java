// MyApp.java
;
import com.sun.javafx.fxml.expression.BinaryExpression;

import static com.sun.javafx.fxml.expression.Expression.multiply;
import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class MyApp {
    public static void main(String[] args) {
        BinaryExpression result1 = multiply(5, 3);
        double result2 = power(2.0, 3);

        System.out.println("Multiplication result: " + result1);
        System.out.println("Power result: " + result2);
    }
}
