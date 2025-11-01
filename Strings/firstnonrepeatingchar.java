import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class firstnonrepeatingchar{
    public static void repeating(String s){
        for(int i = 0;i<s.length();i++){
            boolean repeat = true;
            for(int j = 0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    repeat = false;
                    break;
                }
            }
            if(repeat){
                System.out.print(s.charAt(i));
                break;
            }
        }
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
         repeating(s);
     
    }
}