import java.util.List;
import java.util.Optional;

public class StudentList {


    public static List<Student> students = List.of(
            Student.of(20, "Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.of(21, "Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.of(22, "ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.of(23, "ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.of(24, "DANA", 20, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.of(25, "RUBA", 22, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)
    );

    public static Student getStudentById(int id) {

        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static Student getStudentByIdV1(int id) {

        Student student1 = students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
        if (student1 == null) throw new RuntimeException("Student Not Found");

        return student1;
    }

    public static Student getStudentByIdV2(int id) throws Exception {

        Student student1 = students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
        if (student1 == null) throw new Exception("Student Not Found");

        return student1;
    }

    public static Optional<Student> getStudentByIdV3(int id) {

        Student student1 = students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);

        return student1 == null ? Optional.empty() : Optional.of(student1);
    }

}
