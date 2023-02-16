import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int key = sc.nextInt();
        
        TreeMap<Character, Integer> map = new TreeMap<>();
        
        for(int i=0;i<str.length();i++) {
            if(!map.containsKey(str.charAt(i))) 
                map.put(str.charAt(i), 1);
            else
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        }
        
        int count = 0;
        boolean flag = false;
        
        for(char c : str.toCharArray()) {
            if(map.get(c) ==1) 
                count += 1; 
            
            if(count == key) {
                System.out.println(c);
                flag = true;
                break;
            }      
        }
        
        if(!flag) {
            System.out.println("-1");
        }
    }
}
