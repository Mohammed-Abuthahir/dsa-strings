/* // The two countries of A and B are at war against each other. The power of these soldiers is given by arr1[i] of A and arr2[i] of B. They can only attack their counterpart enemies like arr1[i] can attack only arr2[i] and not anyone else. Both countries have equal number of counterparts. A soldier with a higher power can kill the enemy soldier. If both soldiers have the same power, they both die. You need to find the winning country.
// Note: If no one winning, then return "DRAW" */
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Countrieswar{
    public static String Count(int[] arr1,int[] arr2){
        int ACount = 0;
        int BCount = 0;
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]>arr2[i]){
                ACount++;
            }
            else{
                BCount++;
            }
        }
        if(ACount>BCount){
            return "A";
        }
        else if(BCount>ACount){
            return "B";
        }
        return "DRAW";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1");
        int[] nums1 = new int[n1];
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = scan.nextInt();
        }
        int[] nums2 = new int[n2];
        for(int i = 0;i<nums2.length;i++){
            nums2[i] = scan.nextInt();
        }
        String result = Count(nums1,nums2);
        System.out.println(result + " is the Biggest Country");
    }
}