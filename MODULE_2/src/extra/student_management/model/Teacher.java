package extra.student_management.model;

public class Teacher extends Person {
    private String specialist;
    public Teacher() {

    }
    public Teacher(String specialist, int id, String name, int dateOfBirth, String gender) {
        super(id, name, dateOfBirth, gender);
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialist='" + specialist + '\'' +
                '}' +
                super.toString();
    }
}
