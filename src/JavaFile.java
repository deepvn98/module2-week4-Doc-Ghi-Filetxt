import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class JavaFile {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);
//hiển thị giá trị mảng!
        System.out.println("show list");
        showList(list);
//khai báo file
        File file = new File("test.txt");
        if (!file.exists()){
            file.createNewFile();
        }

//Ghi file!
        FileOutputStream outputStream = new FileOutputStream(file,true);
        int e = 0;
        outputStream.write(e);

        outputStream.close();
//Đọc file
        FileInputStream fileInputStream = new FileInputStream(file);
        int s = fileInputStream.read();
        while (s != -1){
            System.out.println(s+ ",");
            s = fileInputStream.read();
        }
        fileInputStream.close();


    }
    public static void showList(ArrayList<Integer> list){
        for (Integer i:list
             ) {
            System.out.print(i+",");
        }
    }
}
