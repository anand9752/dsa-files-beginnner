import java.util.*;
public class spiralmatrix {
    public static void spiral(int number[][]){


     int startraw = 0;
     int startcol = 0;
     int endrow = number.length -1;
     int endcol = number.length -1;

    while (startcol<=endcol && startraw<= endrow ) {
        
    
     //top
     for (int j = startcol; j <= endcol; j++) {
        System.out.print(number[startraw][j] + " ");
        
     }
     //right
     for (int i = startraw +1 ; i <=endrow; i++) {
        System.out.print(number[i][endcol]+ " ");
        
     }
     //bottom
     for (int i = endcol-1; i >=startcol; i--) {
        System.out.print(number[endrow][i] + " ");
        
     }
     if (startcol==endcol) {
        break;
        
     }
     //left 
     for (int i = endrow -1; i>=startraw +1; i--) {
        System.out.print(number[i][startcol] + " ");
        
     }
     if (startraw== endrow) {
        break;
        
     }
        
            startcol++;
            startraw++;
            endcol--;
            endrow--;
    }
    
    }


    public static void main(String[] args) {


        int number [][]={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                        {13,14,15,16} };

    //   int number[][] = new int[4][4];

                     
                        // for (int  i = 0; i < number.length; i++) {
                            // for
// /Scanner sc = new Scanner(System.in);
                            // number [i]  = sc.nextInt();
                        //  }
                                    //  Scanner sc = new Scanner(System.in);

                         


                         spiral(number);
                         
                    
        
    }

    
    }

