import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoin {
    public static void main(String[] args) {
        int coins[] = {2000,500,200,100,50,20,10,5,2,1};
    //    Arrays.sort(coins, Comparator.reverseOrder());
        int amount = 889;
        int NumOfNotes = 0;

        ArrayList<Integer> Notes = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            
            
        
       
        if (amount >= coins[i]) {
            while (amount >= coins[i]) {
                
            
            Notes.add(coins[i]);
            amount -= coins[i];
              NumOfNotes++;

            }
        }
    }
    System.out.println(NumOfNotes);
    System.out.println(Notes);

    }
    
}
