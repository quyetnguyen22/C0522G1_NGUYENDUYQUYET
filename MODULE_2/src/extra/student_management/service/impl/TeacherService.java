package extra.student_management.service.impl;

import extra.student_management.exception.DuplicateIDException;
import extra.student_management.model.Teacher;
import extra.student_management.service.IpersonService;
import extra.student_management.sort.ComparatorTeacher;
import extra.student_management.utils.ReadFileUtils;
import extra.student_management.utils.WriteFileUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IpersonService {
    private static final String PATH = "src/extra/student_management/data/TeacherFile.csv";
    private static final List<Teacher> TEACHER_LIST = new ArrayList<>();

    private static final Scanner SCANNER = new Scanner(System.in);

    public static Teacher inforTeacher() {
        int id;
        String dateOfBirth;
        String gender;
        String name;
        String specialist;
        do {
            try {
                System.out.println("Nhập ID: ");
                id = Integer.parseInt(SCANNER.nextLine());
                List<Teacher> TEACHER_LIST = ReadFileUtils.readTeacherFile(PATH);
                boolean isExist = false;
                for (Teacher teacher : TEACHER_LIST) {
                    if (teacher.getId() == id) {
                        isExist = true;
                        try {
                            throw new DuplicateIDException("\nID này đã tồn tại!");
                        } catch (DuplicateIDException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }
                if (!isExist){
                    break;
                }
            }catch (NumberFormatException e) {
                System.err.println("""
                        Bạn đã nhập sai!
                        Hãy nhập lại 1 số lớn hơn 0!""");
            }
        }while (true);
        System.out.println("Nhập tên: ");
        name = SCANNER.nextLine();
        System.out.println("Nhập ngày sinh: ");
        dateOfBirth = SCANNER.nextLine();
        System.out.println("Nhập giới tính: ");
        gender = SCANNER.nextLine();
        System.out.println("Nhập chuyên môn: ");
        specialist = SCANNER.nextLine();
        Teacher teacher = new Teacher(id, name, gender, dateOfBirth, specialist);
        return teacher;
    }

    @Override
    public void addMember() {
        List<Teacher> TEACHER_LIST = ReadFileUtils.readTeacherFile(PATH);
        Teacher teacher = inforTeacher();
        TEACHER_LIST.add(teacher);
        WriteFileUtils.writeTeacherFile(TEACHER_LIST);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void remove() {
        List<Teacher> TEACHER_LIST = ReadFileUtils.readTeacherFile(PATH);
        System.out.println("Nhập thành viên(ID) bạn muốn xóa:");
        int idRemove = Integer.parseInt(SCANNER.nextLine());
        boolean isEmpty = false;
        for (Teacher teacher : TEACHER_LIST) {
            if (teacher.getId() == idRemove) {
                System.out.print("Bạn có chắc muốn xóa ID: " + idRemove + " này không?\n" +
                        "1. Có\n" +
                        "2. Không\n");
                int confirm = Integer.parseInt(SCANNER.nextLine());
                if (confirm == 1) {
                    TEACHER_LIST.remove(teacher);
                    WriteFileUtils.writeTeacherFile(TEACHER_LIST);
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
        List<Teacher> TEACHER_LIST = ReadFileUtils.readTeacherFile(PATH);
        if (TEACHER_LIST.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Teacher teacher : TEACHER_LIST) {
            System.out.println(teacher);
        }

    }

    @Override
    public void lookUp() {
        List<Teacher> TEACHER_LIST = ReadFileUtils.readTeacherFile(PATH);
        do {
            System.out.println("""
                    Tìm kiếm.
                    1. Theo ID.
                    2. Theo tên.
                    3. Quay lại.""");
            int choice = Integer.parseInt(SCANNER.nextLine());
            if (choice == 1) {
                System.out.println("Nhập ID bạn muốn tìm kiếm:");
                int idLookUp = Integer.parseInt(SCANNER.nextLine());
                boolean isFlag = false;
                for (Teacher teacher : TEACHER_LIST) {
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
                CharSequence nameLookUp = SCANNER.nextLine();
                boolean isFlag = false;
                for (Teacher teacher : TEACHER_LIST) {
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

    @Override
    public void sort() {
        List<Teacher> TEACHER_LIST = ReadFileUtils.readTeacherFile(PATH);
        if (TEACHER_LIST.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            do {
                System.out.println("""
                        Sắp xếp.
                        1. Theo tên.
                        2. Theo ID.
                        3. Quay lại.""");
                int choice = Integer.parseInt(SCANNER.nextLine());

                if (choice == 1) {
                    Collections.sort(TEACHER_LIST);
                    System.out.println(TEACHER_LIST);
                } else if (choice == 2) {
                    TEACHER_LIST.sort(Collections.reverseOrder(new ComparatorTeacher()));
                    System.out.println(TEACHER_LIST);
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

