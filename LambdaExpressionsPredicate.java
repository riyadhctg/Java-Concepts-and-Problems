package riyadh.sharif;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author riyadh
 */


class Assistant {
    private String type;
    private boolean canMultitask;
    private boolean canSing;

    public Assistant(String type, boolean canMultitask, boolean canSing){
        this.type = type;
        this.canMultitask = canMultitask;
        this.canSing = canSing;
    }

    public boolean canMultitask(){
        return canMultitask;
    }

    public boolean canSing() {
        return canSing;
    }

    public String getType(){
        return type;
    }
}


public class LambdaExpressionsPredicate {
    public static void main (String[] args){
        List<Assistant> assistants = new ArrayList<>();
        assistants.add(new Assistant("Alexa", false, true));
        assistants.add(new Assistant("Siri", true, false));
        assistants.add(new Assistant("Google", true, true));



        //examples of single line lambda expression
        print(assistants, assistant -> assistant.canMultitask());
        print(assistants, assistant -> !assistant.canMultitask());

        //example of block lambda expression
        print(assistants, (Assistant assistant) -> {
            return assistant.canMultitask();
        });

    }

    //with the use of Predicate, we do not need to create class or interface for individual filter
    private static void print(List<Assistant> assistants, Predicate<Assistant> filter) {
        for (Assistant assistant : assistants) {
            if (filter.test(assistant)) {
                System.out.println(assistant.getType());
            }
        }

        System.out.println();
    }
}

