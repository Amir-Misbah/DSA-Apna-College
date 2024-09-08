import java.util.*;

public class FloodFill{
    public static int[][] floodFill(int image[][],int sr,int sc,int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        // helper(image,sr,sc,color,vis,image[sr][sc]);

        return image;
    }
    public static void helper(int image[][],int sr,int sc,int color,boolean vis[][],int orgColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgColor){
            return ;
        }
        helper(image,sr,sc-1,color,vis,image[sr][sc]);
        helper(image,sr,sc+1,color,vis,image[sr][sc]);
        helper(image,sr-1,sc,color,vis,image[sr][sc]);
        helper(image,sr+1,sc,color,vis,image[sr][sc]);
    }
    public static void main(String args[]){
        int image[][] = {
                        {1,1,1},
                        {1,1,0},
                        {1,0,1}
                        };
    }
    int newImage[][] = floodFill(image,0,0,2);
    
    for(int[] arr : image){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.print(" ");
    }
}