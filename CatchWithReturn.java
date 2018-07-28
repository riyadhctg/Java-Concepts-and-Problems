package riyadh.sharif;

/**
 * @author riyadh
 */
public class CatchWithReturn {

    public static void main(String[] args) {
        System.out.println(calculator());
    }

    public static int calculator() {
        try {
            return 10 / 1;
        } catch (ArithmeticException e) {
            System.out.println("error");
            System.exit(0); //the only way to stop the executation of the finally block is to use this system exit code
            return 1;
        } finally {
            System.out.println("finally"); //even if there is no error or exception, the finally block will always get executed.
            return 0;
        }
    }
}
