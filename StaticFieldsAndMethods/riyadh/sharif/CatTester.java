package riyadh.sharif;

/**
 * this programm demonstrates that static variable and methods belong to class not objects.
 * if we create several objects of a class that contains static variables and methods, and makes changes
 * in the variable in one of the objects, all objects will reflect the change
 */

public class CatTester {

    public static void main(String[] args) {

        System.out.println("Printing from CatTester");

        Cat sphynx = new Cat();

        System.out.println(sphynx.count); // warning because we can access the static variable without creating object
        System.out.println(Cat.count);

        Cat anotherCat = new Cat();
        anotherCat.incrementCounter(); // warning because we can access the static method without creating object
        Cat.incrementCounter();

        System.out.println(Cat.count);

        sphynx = null;
        anotherCat = null;

        System.out.println(Cat.count);
        System.out.println(sphynx.count);
        System.out.println(anotherCat.count);

        Cat.count = 10;
        Cat newCat = new Cat();
        Cat cat2 = new Cat();
        newCat.count = 5;

        System.out.println(Cat.count);
        System.out.println(newCat.count);
        System.out.println(cat2.count);

        cat2.count = 11;

        System.out.println(Cat.count); // 11
        System.out.println(newCat.count);
        System.out.println(cat2.count);
    }
}
