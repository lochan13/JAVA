import java.util.ArrayList;

public class StudentOperations {
    ArrayList<Student> students;

    public StudentOperations(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudent(){
        for(Student std : students){
            std.display();
        }
    }
}
