import java.util.Locale;
import java.util.Stack;

public class Palindrome {

    // Test if text is a palindrome.
    // Ignore upper/lower case, white space, and punctuation.
    //


    public static boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<Character>();
        // TODO: implementation
        text = text.replaceAll("[^A-Za-z]+", "").toLowerCase();
        char[] arr = text.toCharArray();
        boolean isPalindrome;
        String s = "";
        for (char i : arr) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            s += stack.pop();
        }

        isPalindrome = s.equals(text);

        return isPalindrome;
    }

    public static void main(String[] args) {
        // TODO: test
        Palindrome palindrome = new Palindrome();
        System.out.println(isPalindrome("Madam, I’m Adam"));


    }
}
