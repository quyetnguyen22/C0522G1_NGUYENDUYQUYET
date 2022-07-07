package SS5_Access_Modifier.Exercise.Student;

public class Student {
    private String name = "John";
    private String classes = "C02";
    Student() {

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
