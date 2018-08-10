/*
An interface in java is a blueprint of a class. It has static constants and abstract methods.
 */

interface Edible {
    void eat();
    //The java compiler adds public and abstract keywords before the interface method.
    //More, it adds public, static and final keywords before data members.

    default void calorie(){System.out.println("default method");}
    //Since Java 8, we can have method body in interface. But we need to make it default method.
}

interface Drinkable {
    void drink();

    //Since Java 8, we can have static method in interface
    static void drinkMore () {
        System.out.println("Static method");
    }
}

/*multiple inheritance is not supported in case of class because of ambiguity.
But it is supported in case of interface because there is no ambiguity as implementation is provided by the implementation class
 */
class Food implements Edible, Drinkable{
    public void eat(){System.out.println("Hello");}
    public void drink(){System.out.println("Welcome");}

    public static void main(String args[]){
        Food food = new Food();
        food.eat();
        food.drink();
        food.calorie();
        Drinkable.drinkMore(); //static methods can be accessed directly unlike instance methods
    }
}

/*A class implements interface but one interface extends another interface*/
interface MoreFood extends Edible {
    void eatMore();


}
