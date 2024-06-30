public class sudoku {

  
  public static boolean isSafe(int sudoku[][], int row, int col, int digit){

// up case me check krna hai ki vo digit h ya nhii
    for (int i = 0; i <= 8; i++) {
      if (sudoku[i][col]==digit) {
        return false;
        
      }
      
    }


    // left me 
    for (int j = 0; j<= 8; j++) {
      if (sudoku[row][j] == digit) {
        return false;
        
      }
    }
// block me dekhe kivo h ya nhi
    int sr = (row/3)*3;
    int sc = (col/3)*3;
    for (int i = sr; i < sr +3; i ++){
      for( int j = sc; j < sc +3; j ++){
        if (sudoku[ i][j]== digit) {
          return false;
          
        }

      }
      
    }
    return true;

  }


  public static boolean solve(int sudoku[][], int row ,int col){

    //bse case
     
    if (row ==9 && col == 0) {
      return true;
      
    }
    // recursion
   int nextcol = col +1;
   int nextrow = row;
   if (col +1 == 9) {
    nextrow = row +1;
    nextcol = 0;
   }


   if (sudoku[row][col] != 0) {
    
    return solve(sudoku, nextrow, nextcol);

   }


    for (int digit = 1; digit <= 9; digit++) {
      if (isSafe(sudoku, row , col, digit)) {
        sudoku[row][col] = digit;

        if (solve(sudoku, nextrow, nextcol)) { // solution exists
         return true;
          
        }

        sudoku[row][col] = 0;
      } 
      
    }
    return false;
    



  }
  public static void print(int sudoku[][]){
    for (int i = 0; i <= 8; i++) {
      for (int j = 0; j <= 8; j++) {
        System.out.print(sudoku[i][j]+ "  | ");        
      }
      System.out.println();
    }
  }
  


    public static void main(String[] args) {
    int sudoku[][] =  {  {7, 0, 0, 0, 0, 0, 2, 0, 0},   
    {4, 0, 2, 0, 0, 0, 0, 0, 3},   
    {0, 0, 0, 2, 0, 1, 0, 0, 0},   
    {3, 0, 0, 1, 8, 0, 0, 9, 7},   
    {0, 0, 9, 0, 7, 0, 6, 0, 0},   
    {6, 5, 0, 0, 3, 2, 0, 0, 1},   
    {0, 0, 0, 4, 0, 9, 0, 0, 0},   
    {5, 0, 0, 0, 0, 0, 1, 0, 6},   
    {0, 0, 6, 0, 0, 0, 0, 0, 8}   
 }  ;

      if(solve(sudoku, 0, 0)){
        System.out.println("solution exist");
        print(sudoku);
      } else {
        System.out.println("not exist");
      }
        
    }
    
}
