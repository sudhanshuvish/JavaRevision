import java.util.ArrayList;
import java.util.List;

class Student1{
    private int id;
    private String name;
    private int marks;

    public Student1(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}


public class StudentMarksManager {
    public static void main(String[] args) {

        List<Student1> student1List = new ArrayList<>();

        student1List.add(new Student1("Luffy", 1, 39));
        student1List.add(new Student1("Zoro", 2, 48));
        student1List.add(new Student1("Nami", 3, 89));
        student1List.add(new Student1("Sanji", 4, 51));
        student1List.add(new Student1("Usopp", 5, 67));

        Student1 topper = null;
        int topMarks = 0;

        for(Student1 std : student1List){
            if(std.getMarks()>topMarks){
                topMarks = std.getMarks();
            }
        }


        for(Student1 std : student1List){
            if(std.getMarks() == topMarks){
                topper = std;
            }
        }
        System.out.println(topper.getName());



    }
}
