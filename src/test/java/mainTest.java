import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void testSignOfSubtractionPositive(){
        main tester = new main();
        assertEquals("POSITIVE", tester.signOfSubtraction(10,5));
    }

    @Test
    void testSignOfSubtractionNegative(){
        main tester = new main();
        assertEquals("NEGATIVE", tester.signOfSubtraction(5,10));
    }

    @Test
    void testSignOfSubtractionEqual(){
        main tester = new main();
        assertEquals("EQUAL", tester.signOfSubtraction(5,5));
    }
}