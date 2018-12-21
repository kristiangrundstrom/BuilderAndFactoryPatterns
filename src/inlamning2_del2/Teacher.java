package inlamning2_del2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Teacher {
    
    private String name;
    private List<Seminar> seminarHistory = new LinkedList<>();
    private Seminar currentSeminar;
  
    

    public Teacher(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Seminar> getSeminarHistory() {
        return seminarHistory;
    }

    public void addSeminarToHistory(List<Seminar> seminar) {
        
        seminarHistory.addAll(seminar);
        Set<Seminar> tempList = new LinkedHashSet<>(seminarHistory);
        seminarHistory.clear();
        seminarHistory.addAll(tempList);
    }

    public void setCurrentSeminar(Seminar currentSeminar) {
        this.currentSeminar = currentSeminar;
    }
    
    public Seminar getCurrentSeminar() {
        return currentSeminar;
    }
    
}
