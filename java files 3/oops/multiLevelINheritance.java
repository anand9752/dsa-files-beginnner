public class multiLevelINheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();

        tommy.eat();
        dog tommy = new dog();
        tommy.legs = 4;
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
//     class Fish extends Animal {
        
//         int fills;
//         void swim ()
// {
//     System.out.println(" swim");
// }    }
    

class mammal extends Animal{
    int legs;
}
class dog extends mammal {
    String breed;

}