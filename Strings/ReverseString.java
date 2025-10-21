import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ReverseString{
    public static void reverse(String str){
        // Approach - 1
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i)+" ");
        }
        // Approach - 2
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        // Approach - 3
        char[] chArr = str.toCharArray();
        for(int i = chArr.length-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        reverse(str);
      
    }
}