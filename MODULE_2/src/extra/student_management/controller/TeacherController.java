package extra.student_management.controller;

import extra.student_management.service.ITeacher;
import extra.student_management.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacher iTeacher = new TeacherService();
    public void teacherMenu() {
        do {
            System.out.println("Chọn thao tác bạn muốn thực hiện:\n" +
                    "1. Thêm thành viên.\n" +
                    "2. Xóa thành viên.\n" +
                    "3. Xem danh sách thành viên.\n" +
                    "4. Quay lại.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacher.addTeacher();
                    break;
                case 2:
                    iTeacher.removeTeacher();
                    break;
                case 3:
                    iTeacher.displayTeacherList();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }
}
