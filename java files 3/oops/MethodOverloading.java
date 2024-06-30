public class MethodOverloading {
    public static void main(String[] args) {
        calculator calcu = new calculator();
       System.out.println( calcu.sum((float)5.2, (float)6.3));
       System.out.println( calcu.sum(2,4));
        System.out.println(calcu.sum(6, 7, 6));s

    }
    
}
class calculator{
    int sum(int  a , int b){
        return a +b;

    }
     float sum(float  a , float b){
        return a + b;


    }
    int sum(int   a , int b, int c){
        return a + b +c ;


    }
        
}