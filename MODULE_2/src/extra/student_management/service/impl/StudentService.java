package extra.student_management.service.impl;

import extra.student_management.model.Student;
import extra.student_management.service.IpersonService;

import java.util.*;

public class StudentService implements IpersonService {
    private static final List<Student> studentList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

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
    public void addMember() {
        Student student = inforStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void remove() {
        System.out.println("Nhập thành viên(ID) bạn muốn xóa:");
        int idRemove = Integer.parseInt(scanner.nextLine());

        boolean isEmpty = false;
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
        if (studentList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Student student : studentList) {
            System.out.println(student);
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
                for (Student student : studentList) {
                    if (student.getId() == idLookUp) {
                        System.out.println(student);
                        isFlag = true;
                        break;
                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy ID");
                }
            }
            else if (choice == 2) {
                System.out.println("Nhập tên bạn muốn tìm kiếm:");
                String nameLookUp = scanner.nextLine();
                boolean isFlag = false;
                for (Student student : studentList) {
                    if (student.getName().contains(nameLookUp)) {
                        System.out.println(student);
                        isFlag = true;
                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy tên!");
                }
            }
            else if (choice == 3) {
                return;
            } else {
                System.out.println("Nhập sai!\n" +
                        "Vui lòng nhập lại!");
            }
        }while (true);
    }

    @Override
    public void sort() {
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() && isSwap ; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {

                if(studentList.get(j).getName().compareTo(studentList.get(j+1).getName()) > 0) {
                    Collections.swap(studentList,j,j+1);
                    isSwap = true;
                }

                else if (studentList.get(j).getName().compareTo(studentList.get(j+1).getName()) == 0) {
                    if (studentList.get(j).getId() > studentList.get(j+1).getId()) {
                        Collections.swap(studentList,j,j+1);
                    }
                }
            }
        }

        System.out.println("Danh sách học sinh sau khi sắp xếp: ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }


}
