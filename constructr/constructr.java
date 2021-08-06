package constructr;

class Employee {
    
    private int id;
    private String name;

    public Employee(){
        id = 15;
        name = "Nilakash";
    }
    public Employee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public Employee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    
}
        
    
public class constructr {
    public static void main(String[] args) {
           Employee ob = new Employee();
           
           
           ob.setName("Roy");
           ob.setId(5);
           System.out.println(ob.getId());          
           System.out.println(ob.getName());
    
    
    }
}
    