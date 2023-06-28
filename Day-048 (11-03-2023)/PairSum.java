import java.util.* ;
import java.io.*;
import java.util.* ;
import java.io.*;
public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();

        for(int i:arr) {
            if(map.containsKey(s-i)) {
                for(int k=0;k<map.get(s-i);k++) {
                    list.add(new int[]{Math.min(i, s-i), Math.max(i, s-i)});
                }
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int [] y) {
                if(x[0] == y[1]) 
                    return x[1] - y[1];
                else    
                    return x[0] - y[0];
            }
        });

        return list;
    }
}
