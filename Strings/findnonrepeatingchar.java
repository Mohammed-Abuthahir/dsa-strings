import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findnonrepeatingchar{
    public static void nonreapetingchar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
       for(Map.Entry<Character,Integer>entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        nonreapetingchar(str);
    }
}