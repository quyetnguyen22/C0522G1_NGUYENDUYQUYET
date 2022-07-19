package extra.student_management.service.impl;

import extra.student_management.model.Teacher;
import extra.student_management.service.IpersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IpersonService {
    private static final List<Teacher> teacherList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

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
    public void addMember() {
        Teacher teacher = inforTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void remove() {
        System.out.println("Nhập thành viên(ID) bạn muốn xóa:");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isEmpty = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.print("Bạn có chắc muốn xóa ID: " + idRemove + " này không?\n" +
                        "1. Có\n" +
                        "2. Không\n");
                int confirm = Integer.parseInt(scanner.nextLine());
                if (confirm == 1) {
                    teacherList.remove(teacher);
                    System.out.printf("Xóa thành công ID: %d\n", idRemove);
                }
                isEmpty = true;
                break;
            }
        }
        if (!isEmpty) {
            System.out.println("Không tìm thấy ID");
        }
    }


    @Override
    public void display() {
        if (teacherList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

    }

    @Override
    public void lookUp() {
        do {
            System.out.println("""
                    Tìm kiếm.
                    1. Theo ID.
                    2. Theo tên.
                    3. Quay lại.""");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Nhập ID bạn muốn tìm kiếm:");
                int idLookUp = Integer.parseInt(scanner.nextLine());
                boolean isFlag = false;
                for (Teacher teacher : teacherList) {
                    if (teacher.getId() == idLookUp) {
                        System.out.println(teacher);
                        isFlag = true;
                        break;
                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy ID");
                }
            }
            if (choice == 2) {
                System.out.println("Nhập tên bạn muốn tìm kiếm:");
                CharSequence nameLookUp = scanner.nextLine();
                boolean isFlag = false;
                for (Teacher teacher : teacherList) {
                    if (teacher.getName().contains(nameLookUp)) {
                        System.out.println(teacher);
                        isFlag = true;
                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy tên!");
                }
            }else if (choice == 3) {
                return;
            } else {
                System.out.println("Nhập sai!\n" +
                        "Vui lòng nhập lại!");
            }
        }while (true);
    }
    }

