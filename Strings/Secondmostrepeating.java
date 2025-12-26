// Second most repeated string in a sequence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Secondmostrepeating{
    public static String repeated(String[] nums){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val : map.values()){
            set.add(val);
        }
        int max = Collections.max(set);
        set.remove(max);
        max = Collections.max(set);
        String Secondrepeting = "";
        for(String key : map.keySet()){
            if(map.get(key) == max){
                Secondrepeting = Secondrepeting + key;
            }
        }
        return Secondrepeting;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the String Array :");
        String[] nums = new String[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextLine();
        }
        String result = repeated(nums);
        System.out.println("Second reapeting String is :"+result);
    }
}