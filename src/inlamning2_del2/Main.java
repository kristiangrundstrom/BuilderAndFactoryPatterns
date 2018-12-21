package inlamning2_del2;

import java.util.List;
import javafx.util.Pair;

public class Main {
    
    public Main() {
        
        Teacher teacherGreta = new Teacher("Greta");
        Teacher teacherUrban = new Teacher("Urban");
        Teacher teacherKennet = new Teacher("Kennet");
        
        Program program1 = new Program("Naturprogrammet");
        Program program2 = new Program("Blandprogrammet");
        Program program3 = new Program("Supertråkiga programmet");
        Program program4 = new Program("Det sista programmet");
        
        Student studentJohan = new Student("Johan");
        Student studentErica = new Student("Erica");
        Student studentFranz = new Student("Franz");
        
        Seminar seminar1 = new Seminar("'Seminarie om allting'");
        Seminar seminar2 = new Seminar("'Seminariet om det tänkvärda'");
        Seminar seminar3 = new Seminar("'Allt tiders seminarie'");
        Seminar seminar4 = new Seminar("'Jag och min bok'");
        
        Subject subject1 = new Subject("Naturvetenskap","Ett jättespännande ämne om djur och natur.");
        Subject subject2 = new Subject("Biologi","Här lär vi oss om kropp och knopp.");
        Subject subject3 = new Subject("Gymnastik","Sitta still är inte bra.");
        Subject subject4 = new Subject("Pedagogik","Att lära ut på ett bra sätt.");
        
        seminar1.addSubject(subject1);
        seminar1.addSubject(subject2);
        seminar2.addSubject(subject2);
        seminar2.addSubject(subject3);
        seminar3.addSubject(subject1);
        seminar3.addSubject(subject3);
        seminar3.addSubject(subject4);
        
        program1.addSeminar(seminar1);
        program1.addSeminar(seminar3);
        program1.addSeminar(seminar4);
        program2.addSeminar(seminar1);
        program2.addSeminar(seminar2);
        program3.addSeminar(seminar1);
        program3.addSeminar(seminar2);
        program3.addSeminar(seminar3);
        program4.addSeminar(seminar4);
        
        ProgramCoordinator coordinator1 = new ProgramCoordinator("Program coordinator 1", program1, teacherGreta);
        coordinator1.addTeacher(teacherUrban);
        
        ProgramCoordinator coordinator2 = new ProgramCoordinator("Program coordinator 2", program2, teacherKennet);
        
        ProgramCoordinator coordinator3 = new ProgramCoordinator("Program coordinator 3", program3, teacherUrban);
        coordinator3.addTeacher(teacherKennet);
        
        ProgramCoordinator coordinator4 = new ProgramCoordinator("Program coordinator 4", program4, teacherKennet);
        coordinator4.addTeacher(teacherUrban);
        
        
        
        // Vilket program en Coordinator ansvarar för?
            System.out.println("Vilket program en Coordinator ansvarar för?\n----------------------");
            System.out.println(coordinator1.getName() + " ansvarar för " + coordinator1.getProgram().getName());
            System.out.println(coordinator2.getName() + " ansvarar för " + coordinator2.getProgram().getName());
            System.out.println("");

            
            
        // Vilka lärare som finns för ett Program?
            System.out.println("Vilka lärare som finns för ett Program?\n---------------------");
            for (Teacher t : coordinator1.getTeacherList()) {
                System.out.println("Teacher " + t.getName() + " undervisar i " + coordinator1.getProgram().getName());
            }
            for (Teacher t : coordinator2.getTeacherList()) {
                System.out.println("Teacher " + t.getName() + " undervisar i " + coordinator2.getProgram().getName());
            }
            for (Teacher t : coordinator3.getTeacherList()) {
                System.out.println("Teacher " + t.getName() + " undervisar i " + coordinator3.getProgram().getName());
            }
            for (Teacher t : coordinator3.getTeacherList()) {
                System.out.println("Teacher " + t.getName() + " undervisar i " + coordinator4.getProgram().getName());
            }
            System.out.println("");
        
        
                
        // Vilka ämnen som undervisats i ett Seminar?
            System.out.println("Vilka ämnen som undervisats i ett Seminar?\n------------------");
            System.out.println("Alla ämnen i " + seminar1.getName());
            for (Subject e: seminar1.getSubjects()) {
                System.out.println(e.getName() + " : " + e.viewSubjectInfo());
            }
            System.out.println("");

            System.out.println("Alla ämnen i " + seminar3.getName());
            for (Subject e: seminar3.getSubjects()) {
                System.out.println(e.getName() + " : " + e.viewSubjectInfo());
            }
            System.out.println("");
            System.out.println("Gretas nuvarande seminarie:");
            System.out.println(teacherGreta.getCurrentSeminar().getName());

            System.out.println("");
        
            
        
        // Hur man skapar en ny Attendance?
            Attendance attendance = new Attendance();

            attendance.registerAttendance(seminar1, studentJohan);
            attendance.registerAttendance(seminar2, studentJohan);
            attendance.registerAttendance(seminar3, studentJohan);

            attendance.registerAttendance(seminar1, studentErica);
            attendance.registerAttendance(seminar2, studentErica);

            attendance.registerAttendance(seminar2, studentFranz);
            attendance.registerAttendance(seminar3, studentFranz);
            
            attendance.registerAttendance(seminar4, studentFranz);
        

        // Vad närvaron är för Student X?
            System.out.println("Vad närvaron är för Student X?\n--------------------");
            System.out.println("Närvaron för Johan är: ");
            for (Seminar e : studentJohan.getSeminarsAttended()) {
                System.out.println(e.getName());
            }            
            System.out.println("");
            
            System.out.println("Nu tar vid bort Johan från första seminariet. Nu ska Johan endast finns i seminarie 2 och 3:");            
            attendance.removeAttendance(seminar1, studentJohan);

            
            for (Seminar e : studentJohan.getSeminarsAttended()) {
                System.out.println(e.getName());
            }
            System.out.println("");
            
            System.out.println("Närvaron för Erica är: ");
            for (Seminar e : studentErica.getSeminarsAttended()) {
                System.out.println(e.getName());
            }
            System.out.println("");

            System.out.println("Närvaron för Franz är: ");
            for (Seminar e : studentFranz.getSeminarsAttended()) {
                System.out.println(e.getName());
            }            
            System.out.println("");
  
        
        // Hur man lägger till en ny student till ett Program? 
            program1.addStudent(studentFranz);
            program1.addStudent(studentErica);
            program2.addStudent(studentErica);
            program2.addStudent(studentJohan);
            program3.addStudent(studentErica);
            program3.addStudent(studentFranz);
            
            
            

  
        // Hur många studenter som finns i ett Program?
        System.out.println("Hur många studenter som finns i ett Program?\n---------------------");
            System.out.println("Hur många studenter finns det i Program 1?");

            for (Student e: program1.getStudents()) {
                System.out.println(e.getName() + " finns i " + program1.getName());
            }

            System.out.println("");

            System.out.println("Hur många studenter finns det i Program 2?");
            for (Student e: program2.getStudents()) {
                System.out.println(e.getName() + " finns i " + program2.getName());
            }
            System.out.println("");

            System.out.println("Hur många studenter finns det i Program 3?");
            for (Student e: program3.getStudents()) {
                System.out.println(e.getName() + " finns i " + program3.getName());
            }
            System.out.println("");
        
        
            
        // Vilka kurser/seminarier som en lärare undervisat i?
            System.out.println("Vilka kurser/seminarier som en lärare undervisat i?\n-------------------");
            
            System.out.println("Kurser som Greta undervisat i: ");

            for (Seminar e : teacherGreta.getSeminarHistory()) {
                System.out.println(e.getName());
            }
            System.out.println("");
            
            System.out.println("Kurser som Kennet undervisat i: ");

            for (Seminar e : teacherKennet.getSeminarHistory()) {
                System.out.println(e.getName());
            }
            System.out.println("");
            
            System.out.println("Senaste seminariet Urban höll");
            System.out.println(teacherUrban.getCurrentSeminar().getName());
            System.out.println("");
            
            
//            Närvaron för Seminar X?
             System.out.println("Närvaron för Seminar X? (" + seminar3.getName() + ")");
             System.out.println("----------------------");
             for (Pair<Attendance,Student> e : seminar3.getTotalAttendance()) {
                 System.out.println(e.getValue().getName());
             }
    }

    public static void main(String[] args) {
        
        Main m = new Main();
        
    }

}
