package homework5;

public class IsPalindrome {
    public static void main(String[] args) {
        String input = "aabbaa";

        char[] characters = input.toCharArray();

        boolean isPalindrome = true;

        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            if (characters[i] != characters[length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}