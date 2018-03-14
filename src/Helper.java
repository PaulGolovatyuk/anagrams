

public class Helper {

    public static String[] splitByWhiteSpace(String s) {
        return s.split(" ");
    }

    public static char[] fromStringToCharArray(String s) {
        return s.toCharArray();
    }

    public static String reverseAndAppend(char[] c) {
        StringBuilder sb = new StringBuilder();
        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }
        return sb.toString();
    }

    public static boolean isLetter(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        }
        return false;
    }

    public static String reverseLettersOnly(String s) {
        String[] strs = splitByWhiteSpace(s);

        char[] chars1 = fromStringToCharArray(strs[0]);
        char[] chars2 = fromStringToCharArray(strs[1]);

        String subStringOne = reverseAndAppend(chars1);
        String subStringTwo = reverseAndAppend(chars2);

        return subStringOne + " " + subStringTwo;
    }

    public static char[] extendedReverseChars(char[] chars1) {
        char tmp;
        for (int i = 0, j = chars1.length - 1; i < chars1.length - 1 && j > i; ) {
            if (isLetter(chars1[i]) || isLetter(chars1[j])) {
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

    public static String fromCharArrayToString(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static String reverseNotLettersOnly(String s) {

        String[] strings = splitByWhiteSpace(s);

        char[] chars1 = fromStringToCharArray(strings[0]);
        char[] chars2 = fromStringToCharArray(strings[1]);

        char[] reversedChars1 = extendedReverseChars(chars1);
        char[] reversedChars2 = extendedReverseChars(chars2);

        String subStringOne = fromCharArrayToString(reversedChars1);
        String subStringTwo = fromCharArrayToString(reversedChars2);

        return subStringOne + " " + subStringTwo;
    }

}


