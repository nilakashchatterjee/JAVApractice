package Square_Reactangle;
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int length,breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class Circle{
    float radius;
    float pi = 3.14f;
    public float area(){
        return pi*radius*radius;
    }
    public float circumference(){
        return 2*pi*radius;
    }
}

public class operation {
    public static void main(String[] args) {
        Square op = new Square();
        op.side=5;
        System.out.println("Area of the square:"+op.area());
        System.out.println("Perimeter of the square:"+ op.perimeter());

        Rectangle rc = new Rectangle();
        rc.length=4;
        rc.breadth=5;
        System.out.println("\n\nArea of the rectangle:"+ rc.area());
        System.out.println("Perimeter of the rectangle:"+rc.perimeter());
        
        Circle c = new Circle();
        c.radius=7;
        System.out.println("\n\nArea of the circle:"+ c.area());
        System.out.println("Circumference of the circle:"+c.circumference());
    
    }   

}
   