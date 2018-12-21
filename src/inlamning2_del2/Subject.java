package inlamning2_del2;


public class Subject {
    private String name;
    private String info;
    
    public Subject(String name, String info) {
        this.name = name;
        this.info = info;
    }
    
    public String viewSubjectInfo() {
        return info;
    }

    public String getName() {
        return name;
    }
}
