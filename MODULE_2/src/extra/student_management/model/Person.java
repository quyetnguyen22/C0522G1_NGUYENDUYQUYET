package extra.student_management.model;
public class Person {
    private int id;
    private String name;
    private int dateOfBirth;
    private String gender;

    public Person() {
    }
    public Person(int id, String name, int dateOfBirth, String gender) {
        this.id = id;
        this.name =name;
        this.dateOfBirth =dateOfBirth;
        this.gender = gender;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getDateOfBirth() {
        return this.dateOfBirth;
    }
    public String getGender() {
        return this.gender;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}