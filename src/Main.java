import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Student student01 = StudentList.getStudentById(23);
        System.out.println("student01 = " + student01);

        Optional<Student> student02 = StudentList.getStudentByIdV3(45);
        System.out.println("student02 = " + student02);

        try {
            Student student03 = StudentList.getStudentByIdV2(32);
        } catch (Exception e) {
            System.out.println("Student Not Found");
        }

        Student student04 = StudentList.getStudentByIdV1(55);
        System.out.println("student04 = " + student04);

    }
}
