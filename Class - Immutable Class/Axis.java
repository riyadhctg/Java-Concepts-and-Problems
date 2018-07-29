package riyadh.sharif;

/**
 * @author riyadh
 */
public class Axis {

    ///in immutable class the class variables are private and final
    private final double x;
    private final double y;

    public Axis(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //in immutable class we only have getters and no setters... so the private class variables cannot be changed... String is an immutable class
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Axis plus(Axis b) {
        double newX = x + b.x;
        double newY = y + b.y;
        return new Axis(newX, newY);
    }


    public static void main(String[] args) {
        Axis a = new Axis(5.0,6.0);
        Axis b = new Axis(-3.0,4.0);

        Axis c = a.plus(b);

        System.out.println("a x= " + a.x + " y= " + a.y);
        System.out.println("b x= " + b.x + " y= " + b.y);
        System.out.println("c x= " + c.x + " y= " + c.y);
    }
}
