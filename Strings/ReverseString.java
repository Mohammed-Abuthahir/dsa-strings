import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ReverseString{
    public static void reverse(String str){
        // Approach - 1
        for(int i = str.length()-1;i>=0;i--){
            System.out.print("First Method :"+str.charAt(i));
        }
        System.out.println();
        // Approach - 2
        StringBuffer sb = new StringBuffer(str);
        System.out.print("Second Method :"+sb.reverse());
        System.out.println();
        // Approach - 3
        StringBuilder sr = new StringBuilder(str);
        System.out.print("Third Method :"+sr.reverse());
        System.out.println();

        // Approach - 4
        char[] chArr = str.toCharArray();
        for(int i = chArr.length-1;i>=0;i--){
            System.out.print("Fourth Method :"+str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        reverse(str);
      
    }
}