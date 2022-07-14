package extra.student_management.service.impl;

import extra.student_management.model.Teacher;
import extra.student_management.service.ITeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacher {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Teacher inforTeacher() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        int dateOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập chuyên môn: ");
        String specialist = scanner.nextLine();
        Teacher teacher = new Teacher(specialist, id, name, dateOfBirth, gender);
        return teacher;
    }

    @Override
    public void addTeacher() {
        Teacher teacher = inforTeacher();
        teacherList.add(teacher);
        System.out.print("Thêm mới thành công!");
    }

    @Override
    public void removeTeacher() {
        System.out.println("Nhập thành viên(ID) bạn muốn xóa:");
        int iDRemove = Integer.parseInt(scanner.nextLine());
        boolean isEmpty = teacherList.size() == 0;
        if (isEmpty) {
            System.out.println("Không tìm thấy ID");
        } else {
            for (Teacher teacher : teacherList) {
                if (teacher.getId() == iDRemove) {
                    System.out.print("Bạn có chắc muốn xóa ID: " + iDRemove + " này không?\n" +
                            "1. Có\n" +
                            "2. Không\n");
                    int confirm = Integer.parseInt(scanner.nextLine());
                    if (confirm == 1) {
                        teacherList.remove(teacher);
                        System.out.printf("Xóa thành công ID: %d\n", iDRemove);
                    }
                    break;
                }
            }

        }
    }

    @Override
    public void displayTeacherList() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

    }
}
