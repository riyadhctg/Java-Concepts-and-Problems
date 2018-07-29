package riyadh.sharif;

/**
 * @author riyadh
 */

public class Bird {

    public Bird () {
    }

    public void eat() {
        System.out.println("Bird eats insects");
    }

    //here we're overloading the eat() method with different parameter... but they can have different access modifiers
    private void eat(String food) {
        System.out.println("Bird eats " + food);
    }

    protected void fly() {
        System.out.println("Birds can fly");
    }

}


class Parrot extends Bird {
    //even though we did not declare a default constructor, jvm will generate one

    @Override
    public void fly(){
        System.out.println("Parrots can fly and sing");
    }

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
    }
}
