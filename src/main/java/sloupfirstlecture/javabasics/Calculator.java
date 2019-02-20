package sloupfirstlecture.javabasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author petr.sloup
 */
public class Calculator {
    private static final Logger log = LoggerFactory.getLogger(JavaBasics.class);

    public int plus(int number1, int number2) {
        int result = number1 + number2;
        log.debug("Result is: [{}]", result);
        return result;
    }

    public int multiply(int number1, int number2) {
        int result = number1 * number2;
        log.debug("Result is: [{}]", result);
        return result;
    }

    public double divide(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Dividing by 0 is forbidden.");
        } else {
            double result = number1 / number2;
            log.debug("Result is: [{}]", result);
            return result;
        }
    }

    public int minus(int number1, int number2) {
        int result = number1 - number2;
        log.debug("Result is: [{}]", result);
        return result;
    }
}
