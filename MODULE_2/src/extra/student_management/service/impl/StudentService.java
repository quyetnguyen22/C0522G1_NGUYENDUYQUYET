package extra.student_management.service.impl;

import extra.student_management.model.Student;
import extra.student_management.service.IpersonService;
import extra.student_management.sort.ComparatorStudent;
import extra.student_management.utils.ReadFileUtils;
import extra.student_management.utils.WriteFileUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IpersonService {
    private static final List<Student> STUDENT_LIST = new ArrayList<>();
    private  static final String PATH = "src/extra/student_management/utils/StudentFile.csv";

    private static final Scanner scanner = new Scanner(System.in);

    public static Student inforStudent() {
        int id;
        String name;
        String gender;
        int dateOfBirth;
        String grade;
        double score;
        do {
            try {
                System.out.println("Nhập ID: ");
                id = Integer.parseInt(scanner.nextLine());
                List<Student> STUDENT_LIST = ReadFileUtils.readStudentFile(PATH);
                boolean isExist = false;
                for (Student student : STUDENT_LIST) {
                    if (student.getId() == id) {
                        isExist = true;
                        try {
                            throw new DuplicateIDException("\nID này đã tồn tại!");
                        } catch (DuplicateIDException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }
                if (!isExist) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.err.println("""
                        Bạn đã nhập sai!
                        Hãy nhập lại 1 số lớn hơn 0!""");
            }
        } while (true);
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        do {
            try {
                System.out.println("Nhập ngày sinh: ");
                dateOfBirth = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("""
                        Bạn đã nhập sai!
                        Hãy nhập lại 1 số lớn hơn 0!""");
            }
        } while (true);
        System.out.println("Nhập giới tính: ");
        gender = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        grade = scanner.nextLine();
        do {
            try {
                System.out.println("Nhập điểm: ");
                score = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("""
                                                
                        Bạn đã nhập sai!
                        Hãy nhập lại 1 số lớn hơn 0!""");
            }
        } while (true);
        Student student = new Student(id, name, gender, dateOfBirth, grade, score);
        return student;
    }

    @Override
    public void addMember() {
        List<Student> STUDENT_LIST = ReadFileUtils.readStudentFile(PATH);
        Student student = inforStudent();
        STUDENT_LIST.add(student);
        WriteFileUtils.writeStudentFile(STUDENT_LIST);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void remove() {
        List<Student> STUDENT_LIST = ReadFileUtils.readStudentFile(PATH);
        System.out.println("Nhập thành viên(ID) bạn muốn xóa:");
        int idRemove = Integer.parseInt(scanner.nextLine());

        boolean isEmpty = false;
        for (Student student : STUDENT_LIST) {
            if (student.getId() == idRemove) {
                System.out.print("Bạn có chắc muốn xóa ID: " + idRemove + " này không?\n" +
                        "1. Có\n" +
                        "2. Không\n");
                int confirm = Integer.parseInt(scanner.nextLine());
                if (confirm == 1) {
                    STUDENT_LIST.remove(student);
                    WriteFileUtils.writeStudentFile(STUDENT_LIST);
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
        List<Student> STUDENT_LIST = ReadFileUtils.readStudentFile(PATH);
        if (STUDENT_LIST.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Student student : STUDENT_LIST) {
            System.out.println(student);
        }
    }

    @Override
    public void lookUp() {
        List<Student> STUDENT_LIST = ReadFileUtils.readStudentFile(PATH);
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
                for (Student student : STUDENT_LIST) {
                    if (student.getId() == idLookUp) {
                        System.out.println(student);
                        isFlag = true;
                        break;
                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy ID");
                }
            } else if (choice == 2) {
                System.out.println("Nhập tên bạn muốn tìm kiếm:");
                String nameLookUp = scanner.nextLine();
                boolean isFlag = false;
                for (Student student : STUDENT_LIST) {
                    if (student.getName().contains(nameLookUp)) {
                        System.out.println(student);
                        isFlag = true;
                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy tên!");
                }
            } else if (choice == 3) {
                return;
            } else {
                System.out.println("Nhập sai!\n" +
                        "Vui lòng nhập lại!");
            }
        } while (true);
    }

    @Override
    public void sort() {
        List<Student> STUDENT_LIST = ReadFileUtils.readStudentFile(PATH);
        if (STUDENT_LIST.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            do {
                System.out.println("""
                        Sắp xếp.
                        1. Theo tên.
                        2. Theo ID.
                        3. Quay lại.""");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    Collections.sort(STUDENT_LIST);
                    System.out.println(STUDENT_LIST);
                } else if (choice == 2) {
                    STUDENT_LIST.sort(Collections.reverseOrder(new ComparatorStudent()));
                    System.out.println(STUDENT_LIST);
                } else if (choice == 3) {
                    return;
                } else {
                    System.out.println("Nhập sai!\n" +
                            "Vui lòng nhập lại!");
                }
            } while (true);
        }
    }


}
