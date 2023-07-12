import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        
        Map<Character, Integer> map = new HashMap<>();
        int value = 1;
        
        for(char i='a';i<='z';i++) {
            map.put(i, value);
            value++;
        }
        
        int diff = map.get(ch2) - map.get(ch1);
        int res = map.get(ch2) + diff;
        
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue() == res) {
                System.out.println(entry.getKey());
            }
        }
    }
}
