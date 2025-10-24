import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeduplicates{
    public static void removed(String s){
        LinkedHashSet<Character>set = new LinkedHashSet<>();
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(char arr : set){
            System.out.print(arr + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        removed(s);
    }
}