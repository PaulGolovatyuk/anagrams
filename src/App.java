import java.util.Arrays;

public class App {

    static String onlyLetters = "abcd efgh";
    static String notOnlyLetters =  "a1bcd efg!h";
        static char[] charArray = onlyLetters.toCharArray();
        static char[] charArrayN = notOnlyLetters.toCharArray();
        static char[] subArrayOne = new char[charArray.length / 2];
        static char[] subArrayTwo = new char[charArray.length / 2];
    static char[] subArrayOneN = new char[charArrayN.length / 2];
    static char[] subArrayTwoN = new char[charArrayN.length / 2];
        static StringBuilder sb1 = new StringBuilder();
        static StringBuilder sb2 = new StringBuilder();




    public static String reverseAndAppend(char []array, StringBuilder sb){
        for (int i = array.length-1; i>=0 ; i--) {
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static boolean isLetter(char c){
        if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            return true;
        }
        return false;
    }
    public static char[] swap(char []charArray) {
        char tmp;
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = charArray.length - 1; j >= 0; j--) {
                if (isLetter(charArray[i])) {
                    if (isLetter(charArray[j])) {
                        tmp = charArray[i];
                        charArray[i] = charArray[j];
                        charArray[j] = tmp;
                        i++;
                    } else j--;
                    if (j==charArray.length/2)break;
                } else i++;
                if (i==charArray.length/2) break;
            }
        }return charArray;
    }

    public static char [] toSubArray(char[] array){
        char[] subArrayOne;
        char[]
        for (int i = 0; i < charArray.length - 1; ) {
            if (charArray[i] != ' ') {
                for (int j = 0; j < subArrayOne.length; ) {
                    subArrayOne[j] = charArray[i];
                    i++;
                    j++;
                }
            }
            else {
                i++;
                for (int j = 0; j < subArrayTwo.length; ) {
                    subArrayTwo[j] = charArray[i];
                    i++;
                    j++;
                }
            }
        }

    }
    public static void main(String[] args) {
        toSubArray(charArray);
        System.out.println(subArrayOne);
        System.out.println(subArrayTwo);
       swap(subArrayOne);
       swap(subArrayTwo);
        System.out.println(subArrayOne);
        System.out.println(subArrayTwo);

        System.out.println();

        toSubArray();

    }


}


