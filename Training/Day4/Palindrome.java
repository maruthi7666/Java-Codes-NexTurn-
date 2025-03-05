package Day4;

public class Palindrome {
    public static void main(String[] args) {
        String str = "12321";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
