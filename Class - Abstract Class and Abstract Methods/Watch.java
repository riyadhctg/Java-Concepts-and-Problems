/*
A class that is declared as abstract is known as abstract class.
It needs to be extended and its method implemented. It cannot be instantiated.
 */

abstract class Watch{
    Watch(){System.out.println("Watch is created");}
    abstract void showTime();
    /* A method that is declared as abstract and does not have implementation is known as abstract method.
    If there is any abstract method in a class, that class must be abstract.
     */
    void adjustTime(){System.out.println("time adjusted");}
}

class SmartWatch extends Watch{
    void showTime(){
        /* If you are extending any abstract class that have abstract method,
        you must either provide the implementation of the method or make this class abstract.
         */
        System.out.println("showing time accurately");

    }
}

class TestAbstraction{
    public static void main(String args[]){
        Watch obj = new SmartWatch();
        obj.showTime();
        obj.adjustTime();
    }
}
