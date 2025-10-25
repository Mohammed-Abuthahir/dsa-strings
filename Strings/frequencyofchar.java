import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class frequemcyofchar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
    }
}