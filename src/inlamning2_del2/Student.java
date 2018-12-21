package inlamning2_del2;

import java.util.LinkedList;
import java.util.List;

public class Student {
    
    private String name;
    private List<Seminar> seminarsAttended = new LinkedList<>();

    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Seminar> getSeminarsAttended() {
        return seminarsAttended;
    }
    
    public void removeSeminar(Seminar seminar) {
        
        for (Seminar e : seminarsAttended) {
            if (e.getName() == seminar.getName()) {
                seminarsAttended.remove(e);
                break;
            }
        }
    }
    
    public void attendSeminar(Seminar seminar) {
        seminarsAttended.add(new Seminar(seminar.getName()));
    }
    
}
