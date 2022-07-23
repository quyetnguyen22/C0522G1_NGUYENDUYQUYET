package ss16_io_text_file.exercise.read_file;

import jdk.dynalink.linker.LinkerServices;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> list() throws IOException {
        List<String> nationalList = new ArrayList<>();
        File file = new File("src/ss16_io_text_file/exercise/read_file/NationalList.csv");
        {
            try {
               FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
//                    nationalList.add(line + "\n");
                }
//                System.out.println(nationalList);
            } catch (FileNotFoundException e) {
                System.err.println("File is NOT found!");
            }
        }
        return nationalList;
    }

    public static void main(String[] args) throws IOException {
        list();
    }

}
