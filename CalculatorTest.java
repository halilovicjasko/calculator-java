import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(4f, 5f));
        List<String> operations = new ArrayList<>(Arrays.asList("+"));

        Calculator.Calculate(numbers, operations);
        
        assertEquals(9f, Calculator.finalResult, "Sabiranje treba vratiti 9");
    }

    @Test
    void testMultiplicationPrecedence() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(10f, 5f, 4f, 3f));
        List<String> operations = new ArrayList<>(Arrays.asList("+", "*", "+"));

        Calculator.Calculate(numbers, operations);

        assertEquals(33f, Calculator.finalResult, "Množenje treba imati prednost nad sabiranjem");
    }

    @Test
    void testDivisionByZero() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(5f, 0f));
        List<String> operations = new ArrayList<>(Arrays.asList("/"));

        Calculator.Calculate(numbers, operations);
        
        assertTrue(Float.isInfinite(Calculator.finalResult), "Dijeljenje s nulom treba vratiti beskonačnost");
    }
}
