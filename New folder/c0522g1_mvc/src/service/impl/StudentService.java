package service.impl;

import model.Student;
import service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!. ");
    }

    @Override
    public void displayAllStudent() {
        for(Student student: studentList) {
            System.out.println(student);
        }
//        for(int i =0; i< studentList.size(); i++) {
//            System.out.println(studentList.get(i));
//        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for(Student student: studentList) {
            if(student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if(chooseYesNo ==1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if(!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    public static Student infoStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên trường: ");
        String nameSchool = scanner.nextLine();
        Student student = new Student(id, name, dateOfBirth, point, nameSchool);
        return student;
    }
}
