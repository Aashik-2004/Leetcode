class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rowlength=image.length;
        int collength=image[0].length;
        int startcolor=image[sr][sc];
        if(startcolor==color) return image;
         recursiveColor(image,sr,sc,color,startcolor,rowlength-1,collength-1);
         return image;

        
    }
    private static void recursiveColor(int[][] image,int row,int col,int color,int startcolor,int n,int m){
        if(row>n || row<0 || col>m || col<0 || image[row][col]!=startcolor) return;
        image[row][col]=color;
        recursiveColor(image,row+1,col,color,startcolor,n,m);
        recursiveColor(image,row-1,col,color,startcolor,n,m);
        recursiveColor(image,row,col+1,color,startcolor,n,m);
        recursiveColor(image,row,col-1,color,startcolor,n,m);

    }
}