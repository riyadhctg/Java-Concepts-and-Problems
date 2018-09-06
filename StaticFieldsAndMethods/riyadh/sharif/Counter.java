package riyadh.sharif;


public class Counter {

    /**
     * we have one static and one non-static variable here.
     * this program demonstrates that static variable belongs to class not objects.
     * this means when we modify the value of static variables in any of the object,
     * the variable in the class changes and all the objects use that value.
     * non-static variables belong to objects. each object can have different value for the
     * non-static variable
     */

    public static int staticCounter;
    public int nonStaticCounter;

    public Counter() {
        staticCounter++;
        nonStaticCounter++;
    }

    public static void main(String[] args) {
        System.out.println("Printing from Counter");

        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        /*
        Each of the above Counter objects use the same staticCounter variable from the class
        but different nonStaticCounter variables that belong to them individually
         */

        System.out.println("Static counter: " + staticCounter);
        System.out.println("Static counter one: " + one.staticCounter);
        System.out.println("Static counter two: " + two.staticCounter);
        System.out.println("Static counter three: " + three.staticCounter);
        System.out.println("Static counter four: " + four.staticCounter);

        /**
         * by the time we created the fourth object of Counter, the Counter contractor ran for four time.
         * as a result, the staticCounter, which was initialized to '0' by default, was incremented four times. So the final value of the staticCounter
         * after creating the fourth object (four) was 4. This value will be used by all other objects (one, two, three)
         */

        staticCounter++;

        System.out.println("Static counter: " + staticCounter);
        System.out.println("Static counter one: " + one.staticCounter);
        System.out.println("Static counter two: " + two.staticCounter);
        System.out.println("Static counter three: " + three.staticCounter);
        System.out.println("Static counter four: " + four.staticCounter);

        /**
         * unlike staticCounter, each time an object was created, there is a new nonStaticCounter created for that object.
         * nonStaticVariable was initialized to '0' by default and each object creation increased its value from 0 to 1.
         */

        System.out.println("Non-Static counter one: " + one.nonStaticCounter);
        System.out.println("Non-Static counter two: " + two.nonStaticCounter);
        System.out.println("Non-Static counter three: " + three.nonStaticCounter);
        System.out.println("Non-Static counter four: " + four.nonStaticCounter);

        one.nonStaticCounter = 2;
        two.nonStaticCounter = 3;
        three.nonStaticCounter = 4;
        four.nonStaticCounter = 5;

        System.out.println("Non-Static counter one: " + one.nonStaticCounter);
        System.out.println("Non-Static counter two: " + two.nonStaticCounter);
        System.out.println("Non-Static counter three: " + three.nonStaticCounter);
        System.out.println("Non-Static counter four: " + four.nonStaticCounter);
    }
}
