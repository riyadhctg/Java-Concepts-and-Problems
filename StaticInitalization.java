import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates the precedence of static initialization
 */

public class StaticInitialization {

    private static final int LENGTH;
    private static int one;
    private static final int two; //needs to be initialized here or in the static block, other wise it will not compile
    private static final int three = 3;
    // private static final int four; //does not compile, because we did not initialize it here or in the static block

    private static final List<String> NAMES = new ArrayList<>();


    static {
        System.out.println("first static init");
        System.out.println("value of variable one before init: " + one); //global int by default initialized to '0'
        int rows = 5;
        int columns = 4;
        LENGTH = rows * columns;
    }

    static {
        System.out.println("third static init");
        NAMES.add("Bob");
        NAMES.add("Sakib");
    }


    static {
        System.out.println("second static init");
        one = 1;
        two = 2;
        one = three;
        //three = 3; --> does not compile as we cannot assign value to final variable
        //two = 6; --> does not compile as we cannot assign value to final variable
        one = 2;
        one = three;
    }


    public static void main(String[] args) {
        System.out.println(NAMES);
        /**
         * This prints the following 5 lines:
         * first static init
         * value of variable one before init: 0
         * third static init
         * second static init
         * [Bob, Sakib]
         *
         * See how the NAMES array was printed last. At first, static blocks gets executed, and then the program enters main and prints NAMES
         */
    }
}
