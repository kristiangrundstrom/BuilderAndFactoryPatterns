package inlamning2_del2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {
    
    private final String name;
    private List<Seminar> seminars = new LinkedList<>();
    private List<Student> students = new LinkedList();
    
    
    public Program(String name) {
        this.name = name;
    }

    public void setStudents(Student student) {
        students.add(student);
    }
    
    public List<Student> getStudents() {
       return students; 
    }

    public String getName() {
        return name;
    }

    public void addSeminar(Seminar seminar) {
        seminars.add(seminar);
    }

    public List<Seminar> getSeminars() {
        return seminars;
    }
    
}
