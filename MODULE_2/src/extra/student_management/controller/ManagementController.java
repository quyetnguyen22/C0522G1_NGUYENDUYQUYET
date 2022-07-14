package extra.student_management.controller;

import java.util.Scanner;

public class ManagementController {
    public static void managementControl() {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chọn đối tượng bạn muốn thao tác:\n" +
                    "1. Giảng viên.\n" +
                    "2. Học sinh.\n" +
                    "3. Thoát.\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    teacherController.teacherMenu();
                    break;
                case 2:
                    studentController.studentMenu();
                    break;
                case 3:
                    System.exit(1);
            }
        } while (true);

    }
}
