public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.color);

    BankAccount myAccount = new BankAccount();
    myAccount.username = "anandpatidar";
    // myAccount.password ="hdfhaf";   issee nhi hoga error ayega 
    myAccount.setpassword("anandhsddfh");


    }
    
}
  

class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){

        color = newcolor;

    }
    void settip (int newtip){
tip = newtip;

    }

}
class BankAccount{
    public String username;
    private String password;

    void setpassword (String pwd){ // ye wali chiz accecible hai kyonki ham private chizo ko function ke ander access kr rhe hai
        password = pwd;

    }
}