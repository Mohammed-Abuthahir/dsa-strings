import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Palindrome{
    public static String palindrome(String s){
        String original = s;
        String reverse = "";
        for(int i = s.length()-1;i>=0;i--){
            reverse = reverse + s.charAt(i);
        }
        if(original.equalsIgnoreCase(reverse)){
            return "Its a Palindrome";
        }
        return "Not a Palindrome";
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = palindrome(s);
        System.out.println("Result :"+result);
    }
}