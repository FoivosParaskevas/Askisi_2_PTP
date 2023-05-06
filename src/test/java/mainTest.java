import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void testSignOfSubtraction() {
        main tester = new main();
        assertEquals("POSITIVE", tester.signOfSubtraction(10,5));
        assertEquals("NEGATIVE", tester.signOfSubtraction(5,10));
        assertEquals("EQUAL", tester.signOfSubtraction(5,5));
    }

}
