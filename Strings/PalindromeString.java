// Less Time Complexity Palindrome
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class PalindromeString{
    public static boolean palindromeornot(String s){
        String original = s;
        char[] Arr = s.toCharArray();
        int left = 0;
        int right = Arr.length-1;
        while(left<=right){
            char temp = Arr[left];
            Arr[left] = Arr[right];
            Arr[right] = temp;
            left++;
            right--;
        }
        s = new String(Arr);
        if(s.equalsIgnoreCase(original)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        boolean result = palindromeornot(s);
        System.out.println("Result :"+result);
    }
}