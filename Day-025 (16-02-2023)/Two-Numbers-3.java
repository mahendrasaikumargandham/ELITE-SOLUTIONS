import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] result = str.split("[ ]", 0);
        List<Integer> arr = new ArrayList<>();
        List<Integer> updatedArr = new ArrayList<>();
        List<Integer> except = new ArrayList<>();
        int sum = 0;
        
        for(String myStr: result) {
            arr.add(Integer.parseInt(myStr));
        }
        for(int i=arr.indexOf(5);i<=arr.indexOf(8);i++) {
            updatedArr.add(arr.get(i));
        }
        for(int i=0;i<arr.indexOf(5);i++) {
            except.add(arr.get(i));
            sum += arr.get(i);
        }
        for(int i=arr.indexOf(8)+1;i<arr.size();i++) {
            except.add(arr.get(i));
            sum += arr.get(i);
        }
        
        String solution = "";
        for(int i=0;i<updatedArr.size();i++) {
            solution = solution + String.valueOf(updatedArr.get(i));
        }
        System.out.println(sum + Integer.parseInt(solution));
    }
}
