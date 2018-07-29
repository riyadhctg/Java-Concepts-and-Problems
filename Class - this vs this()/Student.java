package riyadh.sharif;

/**
 * @author riyadh
 */
public class Student {

    private String firstName;
    private String lastName;

    public Student() {
        this("Safi", "Sharif"); // this method calls the overloaded constructor
    }

    public Student(String firstName, String last) {
//        this(); //this would be recursive as the default constructor calls this constructor with the this("Safi", "Sharif")
        this.firstName = firstName; //the "this" keyword always refer to class fields/variables... "this" refers to the class
        lastName = last; //we could also use "this.lastName = last;" but since the local variable and class variable names are different we don't have to
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student's full name: " + student.getFullName());
    }
}
