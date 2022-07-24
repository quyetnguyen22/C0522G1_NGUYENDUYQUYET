package extra.student_management.utils;

import extra.student_management.model.Student;
import extra.student_management.model.Teacher;
import extra.student_management.service.impl.StudentService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtils {
    private static final StudentService STUDENTSERVICE = new StudentService();
    public static void writeFile(String path, String data) {
        final File FILE = new File(path);
        try {
            final FileWriter WRITER = new FileWriter(FILE);
            final BufferedWriter BUFFERED = new BufferedWriter(WRITER);
            BUFFERED.write(data);
            BUFFERED.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeStudentFile(List<Student> studentList) {
        final String PATH = "src/extra/student_management/utils/StudentFile.csv";
        String header = "ID, Ten, Gioi Tinh, Ngay Sinh, Lop, Diem";
        StringBuilder data = new StringBuilder(header + "\n");
        for (Student student: studentList) {
            data.append(student.getInforStudent()).append("\n");
        }
        writeFile(PATH, data.toString());
    }
    public static void writeTeacherFile(List<Teacher> teacherList) {
        final String PATH = "src/extra/student_management/utils/TeacherFile.csv";
        String header = "ID, Ten, Gioi Tinh, Ngay Sinh, Chuyen Mon";
        StringBuilder data = new StringBuilder(header + "\n");
        for (Teacher teacher: teacherList) {
            data.append(teacher.getInforTeacher()).append("\n");
        }
        writeFile(PATH, data.toString());
    }
}
