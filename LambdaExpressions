package riyadh.sharif;

import java.util.ArrayList;
import java.util.List;

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

interface CheckAssistant {
    boolean check(Assistant assistant);
}

class CheckCanMultitask implements CheckAssistant {

    @Override
    public boolean check(Assistant assistant){
        return assistant.canMultitask();
    }
}

public class LambdaExpressions {
    public static void main (String[] args){
        List<Assistant> assistants = new ArrayList<>();
        assistants.add(new Assistant("Alexa", false, true));
        assistants.add(new Assistant("Siri", true, false));
        assistants.add(new Assistant("Google", true, true));

        //regular technique for filtering
        //it uses the filter class (CheckCanMultitask) that implemented the filter interface (CheckAssistant)
        print(assistants, new CheckCanMultitask());

        //examples of single line lambda expression
        print(assistants, assistant -> assistant.canMultitask());
        print(assistants, assistant -> !assistant.canMultitask());

        //example of block lambda expression
        print(assistants, (Assistant assistant) -> {
            return assistant.canMultitask();
        });

    }


    private static void print(List<Assistant> assistants, CheckAssistant filter) {
        for (Assistant assistant : assistants) {
            if (filter.check(assistant)) {
                System.out.println(assistant.getType());
            }
        }

        System.out.println();
    }
}

