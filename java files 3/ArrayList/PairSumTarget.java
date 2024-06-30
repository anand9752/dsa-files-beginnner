import java.util.ArrayList;

public class PairSumTarget {
    // if pair exist which sum target exist then true
    // this is for sorted array
public static boolean Pairs(ArrayList <Integer > num, int trgt){
    int left = 0;
    int right=num.size()-1;

    while(left != right){
        //case 1
        if (num.get(right) + num.get(left)== trgt) {
            return true;}

            //case2
        if (num.get(right) + num.get(left) < trgt  ) {
            left++;
            
        }
        else{ 
            right--;
    }
        
}
return false;
}

    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        num.add(1);
                num.add(2);

                        num.add(3);

                                num.add(4);

                                        num.add(5);

                                                num.add(6);
            int trgt = 60;

System.out.println(Pairs(num, trgt));
        
    }
    
}
