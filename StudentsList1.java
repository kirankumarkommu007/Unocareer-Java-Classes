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
    public float feePaid() {
        return fee;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSco() {
    	return sco;
    }
    public int getSci() {
    	return sci;
    }
    public int getMaths() {
        return maths;
    }
}

public class StudentsList1 {
    public static void main(String[] args) {
    	float totalfee =85000;
    	
        Student s1 = new Student(100, "Kiran", "MREM", 45000, 25, 90, 99);
        Student s2 = new Student(200, "Rajesh", "JBIT", 35000, 34, 25, 90);        
        Student s3 = new Student(300, "Shiva", "TKR", 25000, 55, 90, 72);   
        Student s4 = new Student(400, "Sujith", "MITS", 55000, 80, 36, 66); 
        Student s5 = new Student(500, "Arshad", "CBIT", 5000, 51, 65, 55);

        ArrayList<Student> stuList = new ArrayList<Student>();

        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4); 
        stuList.add(s5);

        
        System.out.println("Students fee Dues");
        System.out.println("Name\tPaid\tDue");

        
        
        for (Student student : stuList) {
        	float Due = (int)(totalfee-student.feePaid());

            	
                System.out.println(student.getName() + "\t" + student.feePaid()+ "\t" + Due);
        }
        System.out.println();
        System.out.println("Students passed in all Subjects:");
        System.out.println("Name\tmaths\tscience\tsocial\tPaid\tDue");

        for (Student student : stuList) {
            if (student.getMaths() > 50 &&  student.getSci()> 50 &&  student.getSco() > 50) {
            	float Due = (int)(totalfee-student.feePaid());
                System.out.println(student.getName() + "\t" + student.getMaths()+"\t" + student.getSci()+"\t" + student.getSco()+"\t"+ student.feePaid()+ "\t" + Due);
            }
        }
    }
}
