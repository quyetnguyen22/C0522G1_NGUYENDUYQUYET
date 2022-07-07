package SS5_Access_Modifier.Exercise.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nguyen van a.");
        student.setClasses("C0522G1.");
        String fullName = student.getName();
        String className = student.getClasses();
        System.out.printf("Information!\nFull Name: %s\nClass Name: %s", fullName, className);
    }
}
