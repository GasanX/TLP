import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str){
        String stv = new StringBuffer(str).reverse().toString();
        return str.equals(stv);
    }


    public static void main(String[] args) {
        System.out.print("input word \n");
        String sin = new Scanner(System.in).next();
        if(isPalindrome(sin)){
            System.out.print("palindrome");
        }
        else
            {
            System.out.print("Not palindromes");
        }
    }
}
