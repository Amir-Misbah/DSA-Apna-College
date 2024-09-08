public class DiagonalSum{
    public static int diagonalSum(int arr[][]){
        // int spd =0;
        // int ssd = 0;
         //O(n^2)
        // for(int i = 0; i < arr[0].length ;i++){
        //     for(int j = 0;j<arr.length;j++){
        //         if(i == j){
        //             spd += arr[i][j];
        //         }
        //         else if(j == arr.length-i-1){
        //             ssd += arr[i][j];
        //         }
        //     }
        // }
        int sum = 0;
        for(int i= 0 ; i < arr.length; i++){
            sum += arr[i][i];
            if(i != arr.length-i-1){
            sum += arr[i][(arr[0].length-i-1)];}
        }
        return sum;
    }
    public static void main(String args[]){
         int matrix[][] = new int [][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    System.out.println(diagonalSum(matrix));
    }
}