package ss16_io_text_file.practice.maxnuminfile;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.util.ArrayList;
import java.util.List;

public class MaxNumInFile {
//    public List<Integer> readFile(String path)  {
//        List<Integer> listNum = new ArrayList<>();
//        File file = new File(path);
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader);
//            while (true) {
//                listNum.add(Integer.parseInt(reader.readLine()));
//            }
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            System.err.println("File is NOT found!");
//        }
//
//    }

    private static void maxNumInFile() throws IOException {
        File file = new File("src/ss16_io_text_file/practice/maxnuminfile/MaxNum");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        int max = 0;
        String readerLine = "";
        while ((readerLine = reader.readLine()) != null) {
            if (max < Integer.parseInt(readerLine)) {
                max = Integer.parseInt(readerLine);
            }
        }
        fileReader.close();
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) throws IOException {
        maxNumInFile();
    }
}
