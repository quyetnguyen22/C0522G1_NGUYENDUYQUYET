package extra.student_management.sort;

import extra.student_management.model.Student;

public class ComparatorStudent implements java.util.Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
        }
    }
