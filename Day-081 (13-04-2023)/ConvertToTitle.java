class Solution {
    public String convertToTitle(int columnNumber) {
        String str = "";

        while(columnNumber > 0) {
            columnNumber--;
            str = (char)('A' + (columnNumber%26)) + str;
            columnNumber = columnNumber / 26;
        }

        return str;
    }
}
