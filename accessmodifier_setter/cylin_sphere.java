package accessmodifier_setter;



class cylinder{
    
    private int radius;
    private int height;
    public cylinder(int radius, int height){
        this.radius = radius;
        this.radius=radius;
        this.height = height;
        this.height=height;
    }
    public int get_radius(){
        return radius;
    }
    public void set_radius(int radius){
        this.radius=radius;
    }
    public int get_height(){
        return height;
    }
    public void set_height(int height){
        this.height=height;
    }
    public double surface_area(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    
}

class sphere{
    private int radius;

    public sphere(int radius){
        this.radius=radius;
    }
    public int get_radius(){
        return radius;
    }
    public void set_radius(int radius){
        this.radius=radius;
    }
    public double volume(){
        return (4/3)*Math.PI*radius*radius*radius;
    }
    public double surface_area(){
        return 4*Math.PI*radius*radius;
    }
}



public class cylin_sphere {
    public static void main(String[] args) {
       cylinder cy = new cylinder(15, 10) ;
       System.out.println("\nSurface Area of the cylinder: "+cy.surface_area());
       System.out.println("Volume of the cylinder:"+cy.volume());
       cy.set_height(4);
       cy.set_radius(6);
       System.out.println("\nSurface Area of the cylinder: "+cy.surface_area());
       System.out.println("Volume of the cylinder: "+cy.volume());

       sphere sp = new sphere(7);
       System.out.println("\n\n\nSurface area of the sphere: "+sp.surface_area());
       System.out.println("Volume of the sphere: "+sp.volume());
       sp.set_radius(11);
       System.out.println("\nSurface area of the sphere: "+sp.surface_area());
       System.out.println("Volume of the sphere: "+sp.volume());
       
    }
}
