import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Longestsubstring{
    public static int substring(String input){
        String longestsubstring = null;
        int longestsubstringlength = 0;
        char[] s = input.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length;i++){
            if(!map.containsKey(s[i])){
                map.put(s[i],i);
            }
            else{
                i = map.get(s[i]);
                map.clear();
            }
            if(map.size()>longestsubstringlength){
                longestsubstringlength = map.size();
                longestsubstring = map.keySet().toString();
            }
        }
        System.out.println(longestsubstring);
        return longestsubstringlength;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = substring(s);
        System.out.println("Result :"+result);
    }
}