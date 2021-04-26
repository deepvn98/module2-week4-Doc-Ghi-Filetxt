import jdk.jfr.events.FileReadEvent;

import java.io.*;

public class DemoReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Test1.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        String element ="Hello word! \n We are C022I1";
        fileWriter.write(element);
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.readLine();
        while (s != null){
            System.out.println(s);
            s = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
