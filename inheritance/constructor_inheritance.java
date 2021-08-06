package inheritance;
//in this program we are executing the constructor by order, according to the call of the through inheritance
//also used super keyword to implement the overloading of the constructor. 


class base1{
    base1() {
        System.out.println("i am base1 contructor");
    }
    base1( int a) {
        System.out.println("i am base1 overloaded contructor with value of a as: "+a);
    }
}
class derived1 extends base1{
    
    derived1() {
        // super(0);
        System.out.println("i am derived1 class constructor");
    }
    derived1(int a ,int b) {
        super(a); //the passed variable to its super class
        System.out.println("i am derived1 overloaded contructor with value of b as: "+b);
    }
}
class child extends derived1{
    child(){
        System.out.println("i am child class constructor");
    }
    child(int a,int b,int c){
        super(a,b); //the passed variable to its super class
        System.out.println("i am child overloaded contructor with value of c as: "+c);
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        // base1 b = new base1();
        // derived1 d = new derived1(16,9);
        // child cd = new child(10,11,12);
        new child(10,11,12);
    }
}
