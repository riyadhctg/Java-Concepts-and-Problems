package riyadh.sharif;

public class Conifer extends Tree {

    public Conifer(String name){
        super(name);
         /* Removing super will result in error because If your base class has no default constructor,
        then you must explicitly call the correct constructor from all the children classes.
         */
    }

}
