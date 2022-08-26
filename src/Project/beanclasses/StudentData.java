package Project.beanclasses;

public class StudentData {
    private int id;
    private String Studentname;

    public StudentData(int id, String studentname, int studentClass) {
        this.id = id;
        Studentname = studentname;
        StudentClass = studentClass;
    }

    @Override
    public String toString() {
        System.out.println("-------------------------------------------------------------------------");
        return "[" +
                " id= " + id +
                ", Studentname=' " + Studentname + '\'' +
                ", StudentClass= " + StudentClass +
                ']'+"\n-------------------------------------------------------------------------";
    }
    public StudentData()
    {

    }
    private int StudentClass;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public int getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(int studentClass) {
        StudentClass = studentClass;
    }


}
