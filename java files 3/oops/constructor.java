public class constructor {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student(34);
    Student s3 = new Student("aanand");

  }


}


    class Student {
      String name ;
      int roll;
      Student(){
        System.out.println("consructor is called...");
      }
      Student(String name){
        this.name = name;

      }
      Student(int roll){
        this.roll = roll;

      }


    }
    

