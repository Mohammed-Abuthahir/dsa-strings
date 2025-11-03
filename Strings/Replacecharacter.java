import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Replacecharacter{
    public static String Replace(String input,char replace){
        if(input.indexOf(replace)==-1){
            System.out.println("Not Available in the String");
            System.exit(0);
        }
        int count = 1;
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i)==replace){
                input = input.replaceFirst(String.valueOf(replace),String.valueOf(count));
                count++;
            }
        }
        return input;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println("Enter the Replacing Character :");
        char replace = scan.next().charAt(0);
        String result = Replace(s,replace);
        System.out.println("Result :"+result);
    }
}