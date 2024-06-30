import java.util.*;

public class containermostwater {

    public static int findarea(ArrayList<Integer> list){
        int max = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = i +1; j < 9; j++) {
                int height = Math.min(list.get(i),list.get(j) );
                int width = j -i;
                int areaa = height * width;
                max = Math.max(max, areaa);
                
                
            }
            
        }
  return max;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            list.add(num);
            
        }
        System.out.println(findarea(list));
    }
    
}
