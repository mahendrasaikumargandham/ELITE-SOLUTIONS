import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split("\\s");
        
        for(int i=strArr.length-1;i>=0;i--) {
            System.out.print(strArr[i] + " ");
        }
    }
}
