package employee;

class details{
    int id;
    int salary;
    String name;
    public void showdetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
     }
    public int getsalary(){
        return salary;
    }
    public void setname(String n){
        name = n;
    }
}

public class employee {
    public static void main(String[] args) {
        details nil = new details();
        details jay = new details();

        nil.id=15;
        nil.salary= 100000;
        nil.name="Nilakash Chatterjee";

        jay.id= 16;
        jay.salary= 1500;
        jay.name= "Jay Shetty";

        nil.showdetails();
        System.out.println("Salary:"+nil.getsalary());
        jay.showdetails();
        System.out.println("Salary:"+jay.getsalary());
        jay.setname("Jay kumar");
        jay.showdetails();
    }
}
