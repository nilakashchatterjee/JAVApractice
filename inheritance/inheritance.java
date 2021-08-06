package inheritance;

class base{
    int x;

    public base(){
        System.out.println("It is an constructor");
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("base class");
        this.x = x;
    }
    
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("derived class");
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        // creating a object of base class
        // base b = new base();
        // b.setX(15);
        // System.out.println(b.getX());
        
        
        // creating a object of derived class
        derived d = new derived();
        /*if there is no constructor in the derived class
        but we still call the derived class, the constructor in the 
        base class will be executed  */
        
        d.setX(6);
        // d.setY(11);
        // System.out.println(d.getX());
        // System.out.println(d.getY());
        
    }
    
}