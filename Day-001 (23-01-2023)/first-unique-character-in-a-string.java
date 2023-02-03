class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if(map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
            else {
                map.put(ch[i], 1);
            }
        }

        for(int i=0;i<ch.length;i++) {
            if(map.get(ch[i]) < 2) 
                return i;
        }
        return -1;
    }
}
