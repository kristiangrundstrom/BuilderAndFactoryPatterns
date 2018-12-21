package inlamning2_del2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javafx.util.Pair;

public class Seminar {
    private String name;
    private List<Subject> subjects = new LinkedList<>();
    private List<Pair<Attendance,Student>> attendances = new ArrayList<>();
    
    public Seminar(String name) {
        this.name = name;   
    }   

    public List<Subject> getSubjects() {
        return subjects;
    }
    
    public List<Pair<Attendance,Student>> getTotalAttendance() {
        return attendances;
    }

    public void addAttendance(Attendance attendance, Student student) {
        attendances.add(new Pair(attendance, student));
    }
    
    public void removeAttendance(Attendance attendance, Student student) {
        for (Pair<Attendance,Student> e : attendances) {
            if (e.getKey() == attendance && e.getValue() == student) {
                attendances.remove(e);
            }
        }
    }

    public String getName() {
        return name;
    }
    
    public void addSubject(Subject subject) {
        subjects.add(subject);  
    }
}
