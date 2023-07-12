import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
