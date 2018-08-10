package riyadh.sharif;

public class Deciduous extends Tree {

    public Deciduous (String name) {
        super(name);
         /* Removing super will result in error because If your base class has no default constructor,
        then you must explicitly call the correct constructor from all the children classes.
         */
    }

}
