public class gridways {
    public static int count(int i , int j, int n , int m){
        //base
        if (i == n-1 && j == m-1) {  //last cell 
            return 1;
        } else if(i == n || j ==m) { //corner
            return 0;
            
        }
        int w1 = count(i+1, j, n, m);
        int w2 = count(i, j+1, n, m);
        return w1 + w2;

    }


    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        count(0, 0,n,m);
        System.out.println(count(0, 0, n, m));
        
    }
    
}
