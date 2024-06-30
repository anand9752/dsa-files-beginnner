import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class chocolaproblem {
    public static void main(String[] args) {
        int n =4;
         int m =6;
         Integer costVer[] ={2,1,3,1,4};
         Integer costHor[] ={4,1,2};

         Arrays.sort(costVer, Collections.reverseOrder());
                  Arrays.sort(costHor, Collections.reverseOrder());



                  //initialise of index 
                  int v =0;
                  int h =0;
                  int vp =1;
                  int hp =1;
                  //inititalise of pieces
                    int cost =0;

                  while (v < costVer.length && h < costHor.length) {

                      

                    //if cost of horizontal is more than vertical

                    if(costHor[h] > costVer[v]){

                        cost += costHor[h] *vp;

                        h++;
                        hp++;


                    } else {
                        cost += costVer[v] * hp;

                        v++;
                        vp++;

                    }

                    
                  }


                  while (h < costHor.length) {
                       cost += costHor[h] *vp;

                        h++;
                        hp++;
                  }
                

                  while (v < costVer.length) {
                     cost += costVer[v] * hp;

                        v++;
                        vp++;

                    
                  }


System.out.println( "cost of cut is " + cost);
    }
    
}
