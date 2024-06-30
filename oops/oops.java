public class oops{

    public static void main(String[] args) {
        Pen p1 = new Pen();
    }


}
class  Pen {
    String color;
    int tip;

    // make a function t o set pen coloran dtipo
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}


class student {
    String name;
    int age;
    float percentage;
    void calculate(int m,int c,int p){
        percentage = (m+c+p)/3;
    }
}