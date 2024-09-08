public class search2D{
    public static boolean search(int arr[][], int key){
            int endCol = arr[0].length-1;
            int startRow = 0;
            while(startRow < arr.length && endCol > 0){
                 //top to bottom
                if(arr[startRow][endCol] == key ){
                    return true;
                }
                else if(key > arr[startRow][endCol]){
                    startRow++;
                }
                else{
                    endCol--;
                }
            }
            return false;
    }
    public static  void main(String args[]){
       int arr[][] = new int[][]{{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(search(arr,48));
    }
}