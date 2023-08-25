class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }

        int[] occ = new int[map.size()];
        int itr=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            occ[itr] = entry.getValue();
            itr++;
        }

        // for(int i=0;i<occ.length;i++) {
        //     System.out.print(occ[i] + " ");
        // }
        for(int i=0;i<occ.length;i++) {
            for(int j=i+1;j<occ.length;j++) {
                if(occ[i] == occ[j])
                    return false;
            }
        }

        return true;
    }
}
