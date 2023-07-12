import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String newStr = "";
        
        for(int i=str.length()-1;i>=0;i--) {
            newStr = newStr + str.charAt(i);
        }
        
        if(newStr.equals(str))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
