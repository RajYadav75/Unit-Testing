package in.raj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsTest {

    private StringUtils su = new StringUtils();

    @Test
    public void testStringToInt1() {
        Integer actual = su.stringToInt("123");
        assertEquals(123, actual);
    }

    @Test
    public void testStringToInt2() {
        assertThrows(IllegalArgumentException.class,  () -> su.stringToInt(null));
    }

    @Test
    public void testStringToInt3() {
        assertThrows(IllegalArgumentException.class,  () -> su.stringToInt(""));
    }

}
