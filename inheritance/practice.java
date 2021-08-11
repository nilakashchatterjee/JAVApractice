package inheritance;

class circle{
    public int r;

    circle(){
        System.out.println("Circle class non-parameterized constructor...");
    }

    circle(int r){
        System.out.println("Circle class parameterized constructor...");
        this.r = r;

    }

    public double area(){
        System.out.print("The area is: ");
        return Math.PI*this.r*this.r;
    }
}

class cylinder extends circle{
    public int h;

    cylinder(int r, int h){
        super(r);
        this.h = h;
        System.out.println("Cylinder class parameterized constructor... ");
    }
    public double volume(){
        System.out.print("The volume is: ");
        return Math.PI*this.r*this.r*this.h;
    }
}

public class practice {
    public static void main(String[] args) {
        cylinder c = new cylinder(12, 14);
        System.out.println(c.volume()); 
        System.out.println(c.area()); 
        // c.area();
    }
}
