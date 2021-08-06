package this_super;

class demo{
    int x;

    demo() {
        System.out.println("the default constructor");
    }

    public int getX() {
        return x;
    }

    demo(int x){
        // x = x; 
        // if we use the assign without "this" keyword, it will get confused and gives result 0
        this.x=x;
    }
}
class sample extends demo{
    sample(int a){
        super(3);
        System.out.println("i am a constructor");

    }
}

public class this_super {
    public static void main(String[] args) {
        // demo dm = new demo(15);
        sample sp = new sample(3);
        System.out.println(sp.getX());
    }
}
