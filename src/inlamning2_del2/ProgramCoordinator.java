package inlamning2_del2;

import java.util.LinkedList;
import java.util.List;

public class ProgramCoordinator {
    
    private String name;
    private List<Teacher> teacherList = new LinkedList<>();
    private Program program;
    
    public ProgramCoordinator(String name, Program program, Teacher teacher) {
        this.name = name;
        this.program = program;
        
        addTeacher(teacher);
    }
       
    void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
        logTeacher(teacher);
    }
    
    void logTeacher(Teacher teacher) {
        int lastIndex = program.getSeminars().size() -1;
        teacher.addSeminarToHistory(program.getSeminars());
        teacher.setCurrentSeminar(program.getSeminars().get(lastIndex));
    }
    
    public Teacher findTeacher(String teacher) {
        
        for (Teacher t : teacherList) {
                if (t.getName().equals(teacher)) {
                    return t;
                }
            }

        return null;
    }

    public String getName() {
        return name;
    }
    
    public Program getProgram() {
        return program;
    }

    List<Teacher> getTeacherList() {
        return teacherList;
    }
}
