import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.*;  
   
class Solution {  
    public void reverseChar(char[] temp, int x) {
        for(int i=0;i<x/2;i++) {
            char node = temp[i];
            temp[i] = temp[x-1-i];
            temp[x-1-i] = node;
        }
    }
    
    public void reverseString(char[] ch) {
        char[] temp = new char[ch.length];
        int x = 0;
        for(int i=0;i<ch.length;i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= '0' && ch[i] <= '9') {
                temp[x] = ch[i];
                x+=1;
            }
        }
        Solution instance = new Solution();
        instance.reverseChar(temp, x);
        
        x = 0;
        for(int i=0;i<ch.length;i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= '0' && ch[i] <= '9') {
                ch[i] = temp[x];
                x++;
            }
        }
        String str = new String(ch);
        System.out.println(str);
    }
    
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Solution instance = new Solution();
        instance.reverseString(ch);
    }  
}
