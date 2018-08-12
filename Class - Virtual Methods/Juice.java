import java.util.LinkedList;
import java.util.List;

/*
Virtual Methods:
In Java, all non-static methods are by default "virtual functions." Only methods marked with the keyword final,
which cannot be overridden, along with private methods, which are not inherited, are non-virtual.

The methods which cannot be inherited for polymorphic behavior is not a virtual method.

static method is bound to the class itself, so calling the static method from class name or
object does not provide the polymorphic behavior to the static method.
We can override the static method however it will not give the advantage of the polymorphism
 */

public class Juice
{
    public void taste()
    {
        System.out.println("I taste like a regular Juice");
    }

    public static void main(String[] args)
    {
        List<Juice> juice = new LinkedList<Juice>();

        juice.add(new Juice());
        juice.add(new OrangeJuice());
        juice.add(new MandarinOrangeJuice());
        juice.add(new OtherJuice());

        for (Juice currentJuice : juice)
        {
            currentJuice.taste();
        }
    }
}

class OrangeJuice extends Juice
{
    @Override
    public void taste()
    {
        System.out.println("I taste like an orange juice");
    }
}

class MandarinOrangeJuice extends OrangeJuice
{
    @Override
    public void taste()
    {
        System.out.println("I taste like a mandarain orange juice");
    }
}

class OtherJuice extends Juice {}
