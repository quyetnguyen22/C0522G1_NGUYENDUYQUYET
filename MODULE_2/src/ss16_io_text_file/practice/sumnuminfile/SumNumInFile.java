package ss16_io_text_file.practice.sumnuminfile;

import java.io.*;

public class SumNumInFile {

    public static void SumNumInFile() throws IOException {
        File file = new File("src/ss16_io_text_file/practice/sumnuminfile/Number");
        FileReader fileReader = new FileReader(file);
        BufferedReader readerLine = new BufferedReader(fileReader);
        int sum = 0;
        while (true) {
            String numInALine = readerLine.readLine();
            if (numInALine == null) {
                break;
            }
            sum = sum + Integer.parseInt(numInALine);
        }
        System.out.println("Sum=" + sum);
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        SumNumInFile();
    }
}
