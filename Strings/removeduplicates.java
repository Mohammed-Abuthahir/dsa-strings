import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeduplicates{
    public static String removed(String s){
       LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        String str = "";
        for(char arr : set){
            String myString =  String.valueOf(arr);
            str = myString + str;
        }
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = removed(s);;
        System.out.println("After remove duplicates :"+result);
    }
}