import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Countvowels{
    public static void countvowels(String str){
        int vowels = 0;
        int consonents = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
            || str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowels++;
            }
            else{
                consonents++;
            }
        }
        System.out.println("Vowels :"+vowels);
        System.out.println("Consonents :"+consonents);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        countvowels(str);
    }
}