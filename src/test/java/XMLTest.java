import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLTest {
    private XML xml = new XML();

    @Test
    void isValid_wellFormed() {
        String path = "testhwTrue.xml";
        assertTrue(xml.isValid(path));
    }

    @Test
    void isValid_wrong() {
        String path = "testhwFalse.xml";
        assertFalse(xml.isValid(path));
    }
}