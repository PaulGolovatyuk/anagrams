package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverserTest {
    private static final String lettersString = "abcd";
    private static final String lettersAndNonLetters = "Messi7";
    private static final String lettersAndWhitespace = "a1bcd efgh";
    private static final String nonLetters = "12345";
    private static final String justWhitespace = " ";
    private static final String emptyString = "";
    private static final String nullString = null;

    @Test
    public void justLettersTest() {
        assertEquals(StringReverser.reverseStrings(lettersString),
                "dcba");
    }

    @Test
    public void lettersAndNonLettersTest() {
        assertEquals(StringReverser.reverseStrings(lettersAndNonLetters),
                "isseM7");
    }

    @Test
    public void lettersAndWhitespaceTest() {
        assertEquals(StringReverser.reverseStrings(lettersAndWhitespace),
                "d1cba hgfe");
    }

    @Test
    public void nonLettersTest() {
        assertEquals(StringReverser.reverseStrings(nonLetters),
                "12345");
    }

    @Test
    public void justWhiteSpaceTest() {
        assertEquals(StringReverser.reverseStrings(justWhitespace),
                " ");
    }

    @Test
    public void emptyStringTest() {
        assertEquals(StringReverser.reverseStrings(emptyString),
                "");
    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest() {
        StringReverser.reverseStrings(nullString);
    }
}
