import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ReverseEachWord{
    public static String reverse(String s){
        String output = "";
        String[] words = s.split(" ");
        for(String word : words){
            String revword = "";
            for(int i = word.length()-1;i>=0;i--){
                revword = revword + word.charAt(i);
            }
           output = output + revword + " ";
        }
         
        return output;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        String result = reverse(str);
        System.out.println("Result :"+result);

    }
}