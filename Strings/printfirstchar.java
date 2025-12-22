// Print first letter of every word in the string
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class printfirstchar{
    public static String printthefirst(String s){
        String str = "" + s.charAt(0);
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                str = str + s.charAt(i+1);
            }
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = printthefirst(s);
        System.out.println(result);
    }
}