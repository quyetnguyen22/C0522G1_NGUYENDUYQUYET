package extra.student_management.model;

public class Student extends Person implements Comparable<Student> {
    private String grade;
    private double score;

    public Student() {

    }

    public Student(int id, String name, String gender, int dateOfBirth, String grade, double score) {
        super(id, name, dateOfBirth, gender);
        this.grade =grade;
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String getInforStudent() {
        return String.format("%s,%s,%s,%s,%s,%s", this.getId(), this.getName(), this.getGender(), this.getDateOfBirth(), this.getGrade(), this.getScore());
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", score=" + score +
                '}'+
                super.toString();
    }


    @Override
    public int compareTo(Student o) {
        String[] name = new String[0];
        for (int i = 0; i < getName().length(); i++) {
            name = getName().split(" ");
        }
        return name[name.length - 1].compareTo(o.getName());
    }
}
