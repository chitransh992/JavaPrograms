package JdbcExample1;

public class Class {
    private int student_id;
    private String student_name;
    private String subject;
    private int marks;

    public int getId(){
        return student_id;
    }
    public void setStudent_id(int id){
        student_id = id;
    }

    public String getStudent_name(){
        return student_name;
    }
    public void setStudent_name(String studentName){
        student_name = studentName;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
}
