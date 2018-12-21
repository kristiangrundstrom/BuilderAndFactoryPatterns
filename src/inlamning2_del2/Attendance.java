package inlamning2_del2;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

public class Attendance {
    
    private List<Pair<Seminar,Student>> attendanceLevel = new ArrayList<>();
    
    public void registerAttendance(Seminar seminar, Student student) {
        attendanceLevel.add(new Pair(seminar, student));
        student.attendSeminar(seminar);
    }

    public void removeAttendance(Seminar seminar, Student student) {
        for (Pair<Seminar,Student> e: attendanceLevel) {
            if (e.getKey() == seminar && e.getValue() == student) {
                student.removeSeminar(seminar);
                attendanceLevel.remove(e);
                break;
            }
        }
    }
    
    public List<Pair<Seminar,Student>> getAttendanceLevel(Student student) {
        List<Pair<Seminar,Student>> result = new ArrayList<>();
        
       for (Pair<Seminar,Student> e : attendanceLevel) {
           if (e.getValue() == student) {
               System.out.println(e.getKey().getName());
               result.add(e);
           }
       }
       return result;
    }
}
