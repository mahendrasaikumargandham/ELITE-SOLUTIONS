class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        String str = "";
        for(int i=0;i<ch.length;i++) {
            stack.push(ch[i]);
            if(ch[i] == '*') {
                stack.pop();
                stack.pop();
            }
        }

        for(int i=0;i<stack.size();i++) {
            str = str + stack.get(i);
        }
        return str;
    }
}
