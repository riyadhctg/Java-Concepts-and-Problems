import java.util.Arrays;

public class MethodsWithVarArgs {

    /* VarArgs or variable argument simplifies the creation of methods that need to take a variable number
    of arguments.
    VarArgs are written with the variable type followed by three dots (...) and the variable name.
    For instance: int... numbers
    Difference between int[] numbers and int... numbers is that the later is an array of parameters whereas
    int[] numbers is a single parameter of array.
     */


    //VarArgs needs to be last in the parameter list, and you can have only one VarArgs parameter in one method
    public static void eat(int start, int... numbers) {
        System.out.println("start= " + start + " numbers.length= " + numbers.length);
    }

//    public void eat(int... numbers, int start) {} --> this is invalid because VarArgs needs to be the last parameter

//    public void eat(int... start, int... numbers) {} --> this is invalid because we can have only have one VarArgs parameter in one method

    public static void main(String[] args) {

        eat(1);
        eat(2, 3);
        eat(4, 5, 6, 7);
        eat(1, new int[]{4, 5, 6}); // redundant array creation

//        eat(1, null);  // null pointer exception

        drink();
        drink(11, 22, 33, 44, 55, 66, 77, 88, 99);
    }



    public static void drink(int... numbers) {
        for (int number : numbers) {
            System.out.println("number= " + number);
        }

        System.out.println(Arrays.toString(numbers));
    }
}
