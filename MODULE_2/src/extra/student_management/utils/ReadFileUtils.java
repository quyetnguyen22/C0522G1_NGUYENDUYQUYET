package extra.student_management.utils;

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
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (i > 0) {
                    list.add(line);
                }
                i++;
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File is not found!");
        }
//        System.out.println(list);
        return list;
    }

    public static List<Student> readStudentFile(String path) {
        List<String> newList = null;
        try {
            newList = readFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> students = new ArrayList<>();

        String[] info;
        for (String studentList : newList) {
            info = studentList.split(",");
            students.add(new Student(Integer.parseInt(info[0]), info[1], info[2], Integer.parseInt(info[3]), info[4], Double.parseDouble(info[5])));
        }
        return students;
    }

    public static List<Teacher> readTeacherFile(String path) {
        List<String> newList = null;
        try {
            newList = readFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Teacher> teachers = new ArrayList<>();

        String[] info;
        for (String teacherList : newList) {
            info = teacherList.split(",");
            teachers.add(new Teacher(Integer.parseInt(info[0]), info[1], info[2], Integer.parseInt(info[3]), info[4]));
        }
        return teachers;
    }
}
