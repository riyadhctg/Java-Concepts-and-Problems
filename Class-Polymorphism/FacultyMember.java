package riyadh.sharif;

public class FacultyMember {

    public void responsibilities () {
        System.out.println("Lectures");
    }

}

class Lecturer extends FacultyMember {

}

//When Professor is called, it overrides the parent class's responsibilities method.. this overriding is called static polymorphism
class Professor extends FacultyMember {
    @Override
    public void responsibilities () {
        System.out.println("Lectures");
        System.out.println("Conducts research");
    }

    public void colleagues (FacultyMember facultyMember){
        System.out.println("Professors have many Lecturer colleagues");
    }
    

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.responsibilities();

        Lecturer lecturer = new Lecturer();
        lecturer.responsibilities();

        //this is an example of dynamic polymorphism
        //here, we are creating a faculty member object but pointing to the constructor of Professor subclass...
        //whether the assistantProfessor object calls the responsibilities method from parent or the subclass is decided on runtime
        FacultyMember assistantProfessor = new Professor();
        assistantProfessor.responsibilities();

        //colleagues() in Professor class only takes "FacultyMember" objects
        //But, in the below examples, we notice that this method is also taking Lecturer and Professor object
        //This is also due to Polymorphism, we can apply subclass of the object as parameter
        FacultyMember facultyMember = new FacultyMember();
        professor.colleagues(facultyMember);
        professor.colleagues(lecturer);
        professor.colleagues(professor);


    }
}
