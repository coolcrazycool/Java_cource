/*
    isPalindrome
 */
import java.util.Scanner;
public class Palindrome {
    public static String reverseString(String s) {
        String newS = "";
        // берем символы исходной строки с конца строки до начала
        // и добавляем ее в начала строки-результата (переменная r)
        for (int i = s.length() - 1; i >= 0; --i)
            newS += s.charAt(i);
        return newS;
    }

    public static Boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        System.out.println(isPalindrome(s));
    }
}