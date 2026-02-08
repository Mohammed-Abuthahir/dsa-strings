import java.util.*;

class PermutationOfString {
    public static void printPerm(String s, String permutation, LinkedHashSet<String> set) {
        if (s.length() == 0) {
            set.add(permutation);
            return;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i + 1);
            printPerm(newStr, permutation + currChar, set);
        }
    }

    public static ArrayList<String> permutationofString(String s) {
        // 3. Changed Integer to String
        LinkedHashSet<String> set = new LinkedHashSet<>();
        printPerm(s, "", set);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        
        ArrayList<String> result = permutationofString(s);
        System.out.println("Total Permutations: " + result.size());
        System.out.println(result);
        
        scan.close();
    }
}