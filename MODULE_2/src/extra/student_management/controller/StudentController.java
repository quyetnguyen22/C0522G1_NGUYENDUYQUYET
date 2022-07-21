package extra.student_management.controller;

import extra.student_management.service.IpersonService;
import extra.student_management.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private final IpersonService I_STUDENT = new StudentService();
    private final Scanner SCANNER = new Scanner(System.in);
    public void studentMenu() {
        do {
            System.out.println("""
                    Chọn thao tác bạn muốn thực hiện: 
                    1. Thêm thành viên.
                    2. Xóa thành viên.
                    3. Xem danh sách thành viên.
                    4. Tìm kiếm.
                    5. Sắp xếp.
                    6. Quay lại.""");
            int choice = Integer.parseInt(SCANNER.nextLine());
            switch (choice) {
                case 1:
                    I_STUDENT.addMember();
                    break;
                case 2:
                    I_STUDENT.remove();
                    break;
                case 3:
                    I_STUDENT.display();
                    break;
                case 4:
                    I_STUDENT.lookUp();
                    break;
                case 5:
                    I_STUDENT.sort();
                    break;
                case 6:
                    return;
            }
        }while (true);

    }
}
