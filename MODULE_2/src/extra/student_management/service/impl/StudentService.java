package extra.student_management.service.impl;

import extra.student_management.model.Student;
import extra.student_management.service.IStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudent {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Student inforStudent() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        int dateOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập lớp: ");
        String grade = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        int score = Integer.parseInt(scanner.nextLine());
        Student student = new Student(grade, score, id, name, dateOfBirth, gender);
        return student;
    }

    @Override
    public void addStudent() {
        Student student = inforStudent();
        studentList.add(student);
        System.out.print("Thêm mới thành công!");
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập thành viên(ID) bạn muốn xóa:");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isEmpty = studentList.size() == 0;
        if (isEmpty) {
            System.out.println("Không tìm thấy ID");
        } else {
            for (Student student : studentList) {
                if (student.getId() == idRemove) {
                    System.out.print("Bạn có chắc muốn xóa ID: " + idRemove + " này không?\n" +
                            "1. Có\n" +
                            "2. Không\n");
                    int confirm = Integer.parseInt(scanner.nextLine());
                    if (confirm == 1) {
                        studentList.remove(student);
                        System.out.printf("Xóa thành công ID: %d\n", idRemove);
                    }
                    break;
                }
            }
        }

    }

    @Override
    public void displayStudentList() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
