package anagram;

public class StringReverser {

    private static String[] splitByWhiteSpace(String s) {
        return s.split(" ");
    }

    private static boolean isLetter(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        }
        return false;
    }

    private static char[] reverseChars(char[] arrayOfChars) {
        char tmp;
        for (int i = 0, j = arrayOfChars.length - 1; i < arrayOfChars.length - 1 && j > i; ) {
            if (isLetter(arrayOfChars[i]) && isLetter(arrayOfChars[j])) {
                tmp = arrayOfChars[i];
                arrayOfChars[i] = arrayOfChars[j];
                arrayOfChars[j] = tmp;
                i++;
                j--;
            }
            if (!isLetter(arrayOfChars[i])) {
                i++;
            }
            if (!isLetter(arrayOfChars[j])) {
                j--;
            }
        }
        return arrayOfChars;
    }
    public static String reverseStrings(String s) {
        String[] strings = splitByWhiteSpace(s);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <strings.length ; i++) {
                char[] chars = strings[i].toCharArray();
                String str = new String(reverseChars(chars));
                sb.append(str+" ");
        }
        return sb.toString().trim();
    }
}


