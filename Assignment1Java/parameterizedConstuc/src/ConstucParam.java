package constuct;
public class constucParam {
    public static void main(String args[]) {
        student student_1 = new student(10, "Rohit", "CS");
    }

    class student {
        int reg_no;
        String name;
        String stream;

        //Constructor
        constucParam(int reg, String name1, String stream1) {
            reg_no = reg;
            name = name1;
            stream = stream1;
            System.out.println("IN this constructor with arguments of students..");
        }

    }
}
