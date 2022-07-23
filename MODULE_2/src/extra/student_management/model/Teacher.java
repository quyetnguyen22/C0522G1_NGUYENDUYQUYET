package extra.student_management.model;

import java.util.Comparator;

public class Teacher extends Person implements Comparator<Teacher> {
    private String specialist;
    public Teacher() {

    }
    public Teacher(int id, String name, String gender, int dateOfBirth, String specialist) {
        super(id, name, dateOfBirth, gender);
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
    public String getInforTeacher() {
        return String.format("%s,%s,%s,%s,%s", this.getId(), this.getName(), this.getGender(), this.getDateOfBirth(), this.getSpecialist());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialist='" + specialist + '\'' +
                '}' +
                super.toString();
    }
    public int compare(Teacher o1, Teacher o2) {
        int compareName = CharSequence.compare(o1.getName(), o2.getName());
        if (compareName != 0) {
            return compareName;
        } else {
            int compareId = Integer.compare(o1.getId(), o2.getId());
            if (compareId != 0) {
                return compareId;
            }
            return 0;
        }
    }
}
