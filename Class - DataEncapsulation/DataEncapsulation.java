package riyadh.sharif;

/**
 * @author riyadh
 */
public class DataEncapsulation {

    public static void main(String[] args) {
        College company = new College();
        company.setName("ChittagongCollege");
        company.addStudent("Riyadh");
        company.addStudent("Sabbir");
        company.addStudent("Emon");
        company.addStudent(null);
        company.addStudent("");

        company.printSorted();
    }
}
