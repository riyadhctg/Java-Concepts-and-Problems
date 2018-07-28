package riyadh.sharif;

/**
 * @author riyadh
 */
public class CheckedVsUnchecked {

    public static void main(String[] args) {

        //Exception has to be checked/handled/caught within these try block or the main method has to throw exception
        try {
            myMethod();
        } catch (Exception e) {
            System.out.println("Exception found");
        }
        //RuntimeException does not need to be handled
        anotherMethod();
    }

    public static void myMethod() throws Exception {
        throw new Exception("Failed to load");
    }

    public static void anotherMethod() throws RuntimeException {
        throw new RuntimeException("Wrong parameter");
    }
}
