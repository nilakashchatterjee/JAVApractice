package abstract_interfacing;
abstract class first{
   public first(){
       System.out.println("Consttuctor of this class");
   }
   public void talk(){
       System.out.println("hello to everyone");
   }
   abstract public void greet();
}

class second extends first{
    @Override
    public void greet() {
        System.out.println("In second say good morning");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        first ft = new second();
        ft.talk();
        ft.greet();
    }
}
