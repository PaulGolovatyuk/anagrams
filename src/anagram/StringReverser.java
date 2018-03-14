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

    private static char[] reverseChars(char[] chars1) {
        char tmp;
        for (int i = 0, j = chars1.length - 1; i < chars1.length - 1 && j > i; ) {
            if (isLetter(chars1[i]) && isLetter(chars1[j])) {
                tmp = chars1[i];
                chars1[i] = chars1[j];
                chars1[j] = tmp;
                i++;
                j--;
            }
            if (!isLetter(chars1[i])) {
                i++;
            }
            if (!isLetter(chars1[j])) {
                j--;
            }
        }
        return chars1;
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


