package dynamic_method_dispatch;

class phone{
    public void showTime(){
        System.out.println("The showtime is now in phone");
    }
    public void on(){
        System.out.println("This is phone");
    }
}

class smartphone extends phone{
    public void playMusic(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("This is smartphone");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        // phone p = new phone();
        phone ph = new smartphone();
        
        ph.showTime();
        ph.on();
        
    }
}
