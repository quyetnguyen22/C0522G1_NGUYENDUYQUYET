package extra.student_management.controller;

import extra.student_management.service.IStudent;
import extra.student_management.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private IStudent iStudent = new StudentService();
    private Scanner scanner = new Scanner(System.in);
    public void studentMenu() {
        do {
            System.out.println("Chọn thao tác bạn muốn thực hiện:\n" +
                    "1. Thêm thành viên.\n" +
                    "2. Xóa thành viên.\n" +
                    "3. Xem danh sách thành viên.\n" +
                    "4. Quay lại.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudent.addStudent();
                    break;
                case 2:
                    iStudent.removeStudent();
                    break;
                case 3:
                    iStudent.displayStudentList();
                    break;
                case 4:
                    return;
            }
        }while (true);

    }
}
