class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            
            if(!stack.isEmpty()) {
                if(s.charAt(i) == ')' && !stack.contains('(') || s.charAt(i) == ']' && !stack.contains('[') || s.charAt(i) == '}' && !stack.contains('{'))
                    return false;
                if(s.charAt(i) == ')' && stack.peek() == '(' || s.charAt(i) == ']' && stack.peek() == '[' || s.charAt(i) == '}' && stack.peek() == '{')
                    stack.pop();
            }
            else {
                if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')
                    return false;
            }
        }

        if(!stack.isEmpty())
            return false;
        
        return true;
    }
}
