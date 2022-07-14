package extra.student_management.model;

public class Student extends Person {
    private String grade;
    private double score;

    public Student() {

    }
    public Student(String grade, double score, int id, String name, int dateOfBirth, String gender) {
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

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", score=" + score +
                '}'+
                super.toString();
    }
}
