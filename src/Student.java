import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student>{
    private final int id;
    private final String name;
    private final int age;
    private final Gender gender;
    private final boolean active;
    private final List<Course> courses;

    public Student(int id, String name, int age, Gender gender, boolean active, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.active = active;
        this.courses = courses;
    }

    public static Student of(int id, String name, int age, Gender gender, boolean active,Course ... courses){

        return new Student(id, name,age,gender,active, Arrays.asList(courses));
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isActive() {
        return active;
    }

    public List<Course> getCourse() {
        return new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Student o) {
        return Integer.compare(age,o.getAge());
    }
}
