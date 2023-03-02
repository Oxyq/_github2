package gyru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Example_Test {

    @Test
    void example_test0() {
        Assertions.assertTrue(2>=1); //0000
    }

    @Test
    void example_test1() {
        Assertions.assertTrue(3>=2); // 767600
    }
}
