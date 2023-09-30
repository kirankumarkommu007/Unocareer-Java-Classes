import java.util.ArrayList;

class Student {
    int id;
    String name;
    String collegeName;
    float fee;
    int maths;
    int sco;
    int sci;

    public Student(int id, String name, String collegeName, float fee, int maths, int sco, int sci) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
        this.fee = fee;
        this.maths = maths;
        this.sco = sco;
        this.sci = sci;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaths() {
        return maths;
    }
}

public class StudentsList1 {
    public static void main(String[] args) {
        Student s1 = new Student(100, "Kiran", "MREM", 45000, 25, 90, 99);
        Student s2 = new Student(200, "Rajesh", "JBIT", 35000, 34, 78, 90);
        Student s3 = new Student(300, "shiva", "TKR", 25000, 19, 90, 7);
        Student s4 = new Student(400, "Sujith", "MITS", 55000, 80, 70, 66);
        Student s5 = new Student(500, "Arshad", "CBIT", 5000, 49, 5, 55);

        ArrayList<Student> stuList = new ArrayList<Student>();

        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4);
        stuList.add(s5);

        System.out.println("Students who failed in Mathematics:");
        System.out.println("Name\tMaths");

        for (Student student : stuList) {
            if (student.getMaths() < 35) {
                System.out.println(student.getName() + "\t" + student.getMaths());
            }
        }
    }
}
