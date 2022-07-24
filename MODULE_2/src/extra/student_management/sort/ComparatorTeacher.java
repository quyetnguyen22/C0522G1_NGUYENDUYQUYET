package extra.student_management.sort;

import extra.student_management.model.Teacher;

import java.util.Comparator;

public class ComparatorTeacher implements Comparator<Teacher> {
    public int compare(Teacher o1, Teacher o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

