package extra.student_management.utils;

import com.sun.source.tree.WhileLoopTree;
import extra.student_management.model.Student;
import extra.student_management.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtils {
    public static List<String> readFile(String path) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File is not found!");
        }
        return list;
    }

    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> newList = readFile(path);
        List<Student> students = new ArrayList<>();

        String[] info;
        for (String studentList : newList) {
            info = studentList.split(",");
            students.add(new Student(Integer.parseInt(info[0]), info[1], info[2], Integer.parseInt(info[3]), info[4], Integer.parseInt(info[5])));
        }
        System.out.println(students);
        return students;
    }
    public static List<Teacher> readTeacherFile(String path) throws IOException {
        List<String> newList = readFile(path);
        List<Teacher> teachers = new ArrayList<>();

        String[] info;
        for (String studentList : newList) {
            info = studentList.split(",");
            teachers.add(new Teacher(Integer.parseInt(info[0]), info[1], info[2], Integer.parseInt(info[3]), info[4]));
        }
        System.out.println(teachers);
        return teachers;
    }
}
