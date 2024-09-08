public class spiralMatrix{
            public static void spiral(int arr[][]){
            int startCol = 0;
            int endCol = arr[0].length-1;
            int startRow = 0;
            int endRow = arr.length-1;
            while(startRow <= endRow && startCol <= endCol){
                //left to right
                for(int j = startCol; j <= endCol;j++ ){
                    System.out.print(arr[startRow][j] +", ");
                    
                }
                startRow++;
                //top to bottom
                for(int i = startRow ; i <= endRow;i++ ){
                    System.out.print(arr[i][endCol]+", ");
                    
                }
                endCol--;
                //right to left
                for(int j = endCol; j >= startCol;j-- ){
                    // if(startCol == endCol){break;}
                    System.out.print(arr[endRow][j]+", ");
                    
                }
                endRow--;
                //bottom to top
                for(int i = endRow ; i >=  startRow;i-- ){
                    System.out.print(arr[i][startCol]+", ");
                    
                }
                startCol++;
            }
        }
    public static void main (String args[]){

        int matrix[][] = new int [][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};                                          
        spiral(matrix);
    }
}