package riyadh.sharif;

public class Sedan extends Car {

    public Sedan (){
        //super();
        super("blue"); //super() is used to call the parent constructor
        System.out.println("Particularly, I am the Sedan constructor");
    }

    public String fuelIntake () {
        return super.fuelIntake("Diesel"); //super keyword is used to access variable or method from the parent class
    }

    public int doors () {
        super.doors = 4; ////super keyword is used to access variable or method from the parent class
        return doors;
    }

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        System.out.println("Number of doors: " + sedan.doors());
        System.out.println(sedan.fuelIntake());
    }

}
