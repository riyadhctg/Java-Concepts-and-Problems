package riyadh.sharif;

public class AllAboutStringMethods {

    public static void main(String[] args) {

        String str = "I love coding";

        // length
        System.out.println("length= " + str.length());

        // char at
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));

        // index of
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('o', 5));
        System.out.println(str.indexOf("love"));
        System.out.println(str.indexOf("love", 10)); // - match not found

        // substring
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(4, 4)); // empty string


        System.out.println("fUnY".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Bulldog";
//        dog.toUpperCase(); --> because string is immutable, running a metthod does not change it. we have to assign it using '='
        dog = dog.toUpperCase();
        System.out.println(dog);


        //more methods
        String myString = "coding";
        String myString2 = "Coding";
        String myString3 = "co";

        // equality
        System.out.println(myString.equals(myString2));
        System.out.println(myString.equalsIgnoreCase(myString2));
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        // startsWith / endsWith
        System.out.println(myString.startsWith("c"));
        System.out.println(myString.startsWith(myString3));
        System.out.println(myString.startsWith("J".toLowerCase()));
        System.out.println(myString.endsWith("ng"));

        // contains
        System.out.println(myString.contains(myString3));
        System.out.println(myString.contains("od"));
        System.out.println("coding".contains("c".toUpperCase()));

        // replace
        String myNewString = "Coding" + " " + "is" + " " + "cool";

        System.out.println(myNewString.replace('o', 'O'));
        System.out.println(myNewString.replace(" ", "_"));
        System.out.println(myNewString.replace("is", "_"));
        System.out.println(myNewString);

        // trim
        System.out.println("    coding".trim());
        System.out.println(" coding is cool  ");
        System.out.println(" coding is cool  ".trim());
    }
}
