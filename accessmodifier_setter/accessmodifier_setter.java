package accessmodifier_setter;

class Employee{
    private int id;
    private String name;

    public void setname(String nn){
        name = nn;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
    //here we are using methods(getters,setters) to to access private data members 

}

public class accessmodifier_setter {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // emp.id=10;
        // emp.name="Ajay"; --> error due to private access modifier
        emp.setid(15);
        System.out.println(emp.getid());
        emp.setname("Nilakash Chatterjee");
        System.out.println(emp.getname());

    }
    
}
