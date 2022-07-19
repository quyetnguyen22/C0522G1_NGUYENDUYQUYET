package extra.student_management.controller;

import extra.student_management.service.IpersonService;
import extra.student_management.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IpersonService iTeacher = new TeacherService();
    public void teacherMenu() {
        do {
            System.out.println("""
                    Chọn thao tác bạn muốn thực hiện:
                    1. Thêm thành viên.
                    2. Xóa thành viên.
                    3. Xem danh sách thành viên.
                    4. Tìm kiếm
                    5. Quay lại.""");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacher.addMember();
                    break;
                case 2:
                    iTeacher.remove();
                    break;
                case 3:
                    iTeacher.display();
                    break;
                case 4:
                    iTeacher.lookUp();
                    break;
                case 5:
                    return;
            }
        } while (true);

    }
}
