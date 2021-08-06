package accessmodifier_setter;

class circle{
    private float pi=3.14f;
    private int radius;
    
    public void set_radius(int r){
        radius=r;
    }
    public float get_radius(){
        return radius;
    }
    public float circle_area(){
        return pi*radius*radius;
    }
    public float circle_peri(){
        return 2*pi*radius;
    }
}
public class circleop {
    public static void main(String[] args) {
        circle c = new circle();
        c.set_radius(7);
        System.out.println("Radius:"+c.get_radius());
        System.out.println("Area:"+c.circle_area());
        System.out.println("Perimeter:"+c.circle_peri());

    }
}
