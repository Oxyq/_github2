package gyru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Example_Test {

    @Test
    void example_test0() {
        Assertions.assertFalse(2<=1); //0000
    }

    @Test
    void example_test1() {
        Assertions.assertTrue(3>=10); // 767600
    }
}
