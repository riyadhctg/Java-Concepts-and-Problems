package riyadh.sharif;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author riyadh
 */

public class College {

    //this private variables cannot be accessed outside of this file. They can be only indirectly accessed via methods. This is encapsulation
    private String name;
    private List<String> students = new ArrayList<>();


    public void printSorted() {
        System.out.println("Company Name: " + name);
        Collections.sort(students);
        System.out.println("sorted= " + students);
    }
    //we are using this method to set college name instead of trying to directly accessing the name variable... this is encapsulation
    public void setName(String name) {
        if(name == null) {
            System.out.println("name cant be null");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("cannot add null student");

        } else {
            students.add(name);
        }
    }
}
