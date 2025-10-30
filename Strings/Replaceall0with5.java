// You are given an integer n. You need to convert all zeroes of n to 5.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Replaceall0with5{
    public static int converstion(int num){
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]=='0'){
                arr[i]='5';
            }
        }
        int nums = 0;
        for(char c : arr){
            nums = nums * 10 + (c-'0');
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int result = converstion(num);
        System.out.println("Result :"+result);
    }
}