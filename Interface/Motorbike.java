package Interface;

public class Motorbike implements Interfaceclass {
    public int seath;
    public int gear;
    public int speed;
    public Motorbike(int sh, int sgear, int sspeed){
        seath = sh;
        gear = sgear;
        speed = sspeed; 
    }
    public void applyBreak(int increment)
    {
       speed=speed+increment;
    }
    public void speedup(int decrement)
    {
        speed=speed-decrement;
    }
}
