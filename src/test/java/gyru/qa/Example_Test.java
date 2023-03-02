package gyru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Example_Test {
    @Test
    void example_test0() {
        Assertions.assertTrue(new Random().nextInt() > 1); //000
    }

    @Test
    void example_test1() {
        Assertions.assertTrue(3>2); // 0O0
    }
}
