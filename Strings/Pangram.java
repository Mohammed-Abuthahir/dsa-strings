import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Pangram{
    public static String pangram(String s){
        int n = s.length();
        if(n<26){
            return "Not a Pangram";
        }
        boolean[] arr = new boolean[26];
        for(int i = 0;i<n;i++){
            char x = s.charAt(i);
        if(x>='a' && x<='z'){
            arr[x-'a'] = true;
        }
        else if(x>='A' && x<='Z'){
            arr[x-'A'] = true;
        }
        }
        for(int i = 0;i<26;i++){
            if(arr[i]==false){
                return "Not a Pangram";
            }
        }
        return "Its a Pangram";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = pangram(s);
        System.out.println("Result :"+result);
    }
}