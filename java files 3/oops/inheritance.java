public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// base class
    class Animal {
        String color;
        void eat (){
            System.out.println("eat");

        }
        void breath(){
            System.out.println("breath");
        }
    }

    // derived class 
    class Fish extends Animal {
        
        int fills;
        void swim ()
{
    System.out.println(" swim");
}    }
    

