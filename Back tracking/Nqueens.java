public class Nqueens{
    public static void nqueen(char board[][],int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        for(int j = 0 ; j < board.length ; j++){
            if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            nqueen(board,row+1);
            board[row][j] = '.';
            }
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        for(int i = row; i >= 0 ;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row -1,j = col-1; i >= 0 && j>= 0 ;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row -1,j = col+1; i >= 0 && j < board.length ;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
    return true;
    }
    public static void printBoard(char board[][]){
        System.out.println("---------------------Chess Board----------------");
          for(int i = 0 ; i < board.length; i++){
            System.out.println("");
            for(int j = 0 ; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
       
        System.out.println(""); }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j < board[0].length; j++){
                board[i][j] = '.';
            }
        }
    nqueen(board,0);
    }
}