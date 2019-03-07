package sloup.javabasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaBasics {
    private static final Logger log = LoggerFactory.getLogger(JavaBasics.class);
    // TODO: create class
    // TODO: main method - system.out.printl
    // TODO: normal method
    // TODO: variables

    private int integerNumberField = 20;
    private String personNameField = "Petr Sloup";

    public static void main(String[] args) {

        String personName = "Jeroným";
        greetThePerson(personName);

        Calculator calculator = new Calculator();
        int result = calculator.plus(5, 6);
        double result2 = calculator.divide(5, 0);

        System.out.println(result);
        System.out.println(result2);

    }

    private static void greetThePerson(String personName) {
        System.out.println("Hello " + personName + ", my friend! :)");
    }

}
