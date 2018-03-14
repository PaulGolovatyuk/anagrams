import java.util.Arrays;

public class Application {
    static String lettersOnly = "abcd efgh";
    static String notLettersOnly = "a1bcd efg!h";

    public static void main(String[] args) {


        System.out.println("Reversing strings with letters only demo: ");
        System.out.println("Before:     " + lettersOnly);
        System.out.println("After:      " + Helper.reverseLettersOnly(lettersOnly));

        System.out.println();

        System.out.println("Reversing strings with not letters only demo: ");
        System.out.println("Before:     " + notLettersOnly);
        System.out.println("After:      " + Helper.reverseNotLettersOnly(notLettersOnly));

    }
}
