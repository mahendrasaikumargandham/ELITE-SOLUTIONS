class Solution {
    public int myAtoi(String s) {
        int numbericSign = 0;
        int digit = 0;
        long res = 0;
        boolean negative = false;
        boolean overRide = false;
        if(s.length() < 0) 
            return 0;
        int i = 0;

        while(i < s.length() && s.charAt(i) == ' ')
            i++;

        if(i<s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if(s.charAt(i) == '-')
                negative = true;
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))) {
            digit = digit + 1;
            res = res * 10 + s.charAt(i) - '0';
            if(Integer.MAX_VALUE < res) {
                overRide = true;
                break;
            }
            i++;
        }

        if(digit == 0)
            return 0;
        
        if(negative == true) {
            if(overRide == true) {
                return Integer.MIN_VALUE;
            }
            return -(int)res;
        }

        if(overRide == true)
            return Integer.MAX_VALUE;
        return (int)res;
    }
}
