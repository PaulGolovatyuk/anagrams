package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverserTest {
    private static final String justLettersString = "abcd";
    private static final String lettersWithOtherSymbolsString = "Messi7";
    private static final String lettersWithWhitespacesString = "a1bcd efgh";
    private static final String justSymbolsString = "12345";
    private static final String justWhitespaceString = " ";
    private static final String emptyString = "";
    private static final String nullString = null;

    @Test
    public void creatingStringReverserShouldNotThrowNPE() {
        new StringReverser();
    }

    @Test
    public void shouldReverseJustLettersString() {
        assertEquals(StringReverser.reverseStrings(justLettersString),
                "dcba");
    }

    @Test
    public void shouldReverseLettersWithOtherSymbolsString() {
        assertEquals(StringReverser.reverseStrings(lettersWithOtherSymbolsString),
                "isseM7");
    }

    @Test
    public void shouldReverseLettersWithWhitespacesString() {
        assertEquals(StringReverser.reverseStrings(lettersWithWhitespacesString),
                "d1cba hgfe");
    }

    @Test
    public void shouldReverseEmptyString() {
        assertEquals(StringReverser.reverseStrings(emptyString),
                "");
    }

    @Test(expected = NullPointerException.class)
    public void shouldReverseNullString() {
        StringReverser.reverseStrings(nullString);
    }

    @Test
    public void shouldReverseJustWhitespaceString() {
        assertEquals(StringReverser.reverseStrings(justWhitespaceString),
                " ");
    }

    @Test
    public void shouldReverseJustSymbolsString() {
        assertEquals(StringReverser.reverseStrings(justSymbolsString),
                "12345");
    }

}
