import java.util.ArrayList;
import java.util.List;

public class FinalVariables {

    //final variables are conventionally written with all caps
    private static final int LENGTH = 10;

    private static final List<String> MYLIST = new ArrayList<>();

    public static void main(String[] args) {
        int[] myArray = new int[LENGTH];

        //LENGTH = 11; // does not compile
        //LENGTH++; // does not compile
        int doubleSize = 2 * LENGTH;

        for(int i = 0; i < LENGTH; i++) {
            System.out.println(myArray[i]);
        }

        MYLIST.add("changed");
//        MYLIST = new ArrayList<>(); // does not compile -> "cannot assign a value to final variable MYLIST"

        final int myNumber = 10;
//        myNumber = 11; // does not compile
    }
}
