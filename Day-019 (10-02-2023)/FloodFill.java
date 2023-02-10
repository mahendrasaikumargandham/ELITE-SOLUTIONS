class Solution {
    public void fillColor(int[][] image, int sr, int sc, int presentColor, int newColor) {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != presentColor) 
            return;
        
        image[sr][sc] = newColor;
        fillColor(image, sr, sc+1, presentColor, newColor);
        fillColor(image, sr, sc-1, presentColor, newColor);
        fillColor(image, sr+1, sc, presentColor, newColor);
        fillColor(image, sr-1, sc, presentColor, newColor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) 
            return image;

        fillColor(image, sr, sc, image[sr][sc], color);
        return image;
    }
}
