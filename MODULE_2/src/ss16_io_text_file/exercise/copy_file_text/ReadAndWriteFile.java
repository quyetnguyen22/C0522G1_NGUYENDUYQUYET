package ss16_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> readFile(String sourcePath) throws IOException {
        List<String> stringList = new ArrayList<>();
        File file = new File(sourcePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String reader;
            while ((reader = bufferedReader.readLine()) != null) {
                stringList.add(reader);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File is NOT found!");
        }
        return stringList;
    }

    public static void writeFile(String targetPath, List<String> stringList) {
        try {
            File newFile = new File(targetPath);
            FileWriter fileWriter = new FileWriter(newFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            int count = 0;
            for (String list : stringList) {
                bufferedWriter.write(list);
                bufferedWriter.newLine();
                count += list.length();
            }
            System.out.println(count);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> newStringList = readFile("src/ss16_io_text_file/exercise/copy_file_text/SourceFile.txt");
        writeFile("src/ss16_io_text_file/exercise/copy_file_text/TargetFile.txt",newStringList);
    }
}
