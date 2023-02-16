import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String numberString = str.replaceAll("[^0-9]", "");
        long numberStr = Long.parseLong(numberString);
        long specialStr = str.replaceAll("[a-zA-Z0-9]", "").length();
      
        List<Long> arr = new ArrayList<>();
        List<Long> even = new ArrayList<>();
        List<Long> odd = new ArrayList<>();
        
        for(int i=numberString.length()-1;i>=0;i--) {
            arr.add(numberStr % 10);
            numberStr /= 10;
        }
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) % 2 == 0) {
                even.add(arr.get(i));
            }
            else {
                odd.add(arr.get(i));
            }
        }
        
        Collections.reverse(even);
        Collections.reverse(odd);
        
        int index = 0;
        if(specialStr % 2 == 0) {
            if(even.size() >= odd.size()) {
                for(int i=0;i<odd.size();i++) {
                    System.out.print(even.get(i) + "");
                    System.out.print(odd.get(i) + "");
                    index += 1;
                }
                for(int k=index;k<even.size();k++) {
                    System.out.print(even.get(k));
                }
            }
            else {
                for(int i=0;i<even.size();i++) {
                    System.out.print(even.get(i) + "");
                    System.out.print(odd.get(i) + "");
                    index += 1;
                }
                for(int k=index;k<odd.size();k++) {
                    System.out.print(odd.get(k));
                }
            }
        }
        else {
            if(even.size() >= odd.size()) {
                for(int i=0;i<odd.size();i++) {
                    System.out.print(odd.get(i) + "");
                    System.out.print(even.get(i) + "");
                    index += 1;
                }
                for(int k=index;k<even.size();k++) {
                    System.out.print(even.get(k));
                }
            }
            else {
                for(int i=0;i<even.size();i++) {
                    System.out.print(odd.get(i) + "");
                    System.out.print(even.get(i) + "");
                    index += 1;
                }
                for(int k=index;k<odd.size();k++) {
                    System.out.print(odd.get(k));
                }
            }
        }
    }
}
