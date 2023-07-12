import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ch = str.split("\\s");
        
        int max = Integer.MIN_VALUE;
        int count = 0;
        
        for(int i=ch.length-1;i>=0;i--) {
            if(Integer.parseInt(ch[i]) > max) {
                max = Integer.parseInt(ch[i]);
                count++;
            }
        }
        
        System.out.println(count);
    }
}
