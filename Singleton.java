public class Singleton {

    private static Singleton single_instance = null;

    public String s;

    private Singleton () {
        s = "I am the singleton constructor!";
    }

    public static Singleton getInstance () {
        if (single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        instance1.s = "I am the variable for the first instance";

        System.out.println(instance1.s);
        System.out.println(instance2.s);
        System.out.println(instance3.s);
    }
}




