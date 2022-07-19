package extra.student_management.controller;

import extra.student_management.service.IpersonService;
import extra.student_management.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private final IpersonService iStudent = new StudentService();
    private final Scanner scanner = new Scanner(System.in);
    public void studentMenu() {
        do {
            System.out.println("""
                    Chọn thao tác bạn muốn thực hiện:
                    1. Thêm thành viên.
                    2. Xóa thành viên.
                    3. Xem danh sách thành viên.
                    4. Sắp xếp.
                    5. Quay lại.""");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudent.addMember();
                    break;
                case 2:
                    iStudent.remove();
                    break;
                case 3:
                    iStudent.display();
                    break;
                case 4:
                    iStudent.lookUp();
                    break;
                case 5:
                    return;
            }
        }while (true);

    }
}
