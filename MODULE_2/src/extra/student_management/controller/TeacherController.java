package extra.student_management.controller;

import extra.student_management.service.IpersonService;
import extra.student_management.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final IpersonService I_TEACHER = new TeacherService();
    public void teacherMenu() {
        do {
            System.out.println("""
                    Chọn thao tác bạn muốn thực hiện:
                    1. Thêm thành viên.
                    2. Xóa thành viên.
                    3. Xem danh sách thành viên.
                    4. Tìm kiếm
                    5. Quay lại.""");
            int choice = Integer.parseInt(SCANNER.nextLine());
            switch (choice) {
                case 1:
                    I_TEACHER.addMember();
                    break;
                case 2:
                    I_TEACHER.remove();
                    break;
                case 3:
                    I_TEACHER.display();
                    break;
                case 4:
                    I_TEACHER.lookUp();
                    break;
                case 5:
                    return;
            }
        } while (true);

    }
}
