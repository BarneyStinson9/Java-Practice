package Interface;

public class Mainclass {

    public static void main(String[] args) {
        Motorbike obj = new Motorbike(20, 45, 500);
        System.out.println("seatheight:"+obj.seath);
        System.out.println("sg"+obj.gear);
        System.out.println("speed"+obj.speed);
        obj.applyBreak(10);
        System.out.println("speed:"+obj.speed);
        obj.speedup(100);
        System.out.println("speed:"+obj.speed);
    }
}
