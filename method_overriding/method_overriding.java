package method_overriding;

class A{
    public void demo(){
        System.out.println("Method demo from class A");
    }
}
class B  extends A{
    // here we are overriding demo method from class A
    
    //good to use,so that we can confirm the overriding is working.
    @Override   
    public void demo(){
        System.out.println("Method demo from class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.demo();

        B b = new B();
        b.demo();
    }
}
