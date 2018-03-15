package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverserTest {
    private static final String s = "a1bcd efg!h";

    @Test
    public void reverseStringsShouldNotReturnNull() {
        assertNotNull(StringReverser.reverseStrings(s));
    }

    @Test
    public void reverseStringsShouldReturnNextString() {
        assertEquals(StringReverser.reverseStrings(s), "d1cba hgf!e");
    }

    @Test
    public void creatingStringReverserShouldNotThrowNPE() {
        new StringReverser();
    }
}
