public class nQueen { 
    
    public static boolean isSafe(char Board[][],int row , int col) {
        //vertical up 
    for (int i = row -1; i >=0; i--) {
        if (Board[i][col] == 'Q') {
            return false;}}

            // diagonal up left
              for (int i = row -1, j = col -1; i >=0 && j >=0; i--, j--) {
        if (Board[i][j] == 'Q') {
            return false;}
    }
       //diagonal up right
         for (int i = row -1, j = col +1; i >=0 && j <Board.length; i--,j++) {
        if (Board[i][j] == 'Q') {
            return false;}
        }

return true;
    }

    public static void quenn(char Board[][], int row){
    
        
        if (row == Board.length) {
        printboard(Board);
        return;
            
        }
        for (int j = 0; j < Board.length; j++) {
            if(isSafe(Board, row, j)){
            Board[row][j]='Q';
            quenn(Board, row +1);//function calling
            Board[row][ j] =  '-';// backtracking 
            
        }}

    }
    public static void printboard(char Board[][]){
        System.out.println("--------chess board---------");
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                System.out.print(Board[i][j]);
                
            }
            System.out.println();
            
        }
    }


    public static void main(String[] args) {
        int n = 5;
         char Board[][] = new char[n][n];
          for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j <Board.length; j++) {
                Board[i][j] ='-';}}
         
         quenn(Board, 0);

        
    }                  

    
}   
