import java.io.*;
import java.nio.charset.StandardCharsets;

public class TaoThuMuc {
    public static void main(String[] args) throws IOException {
        File persion = new File("persion");
        persion.mkdir();
        if (!persion.exists()){
            persion.createNewFile();
        }
        File file = new File("persion/nhanvien.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream outputStream = new FileOutputStream(file);
        String s = " Hello word!\n I am here!";
        outputStream.write(s.getBytes());
        outputStream.close();

        FileInputStream inputStream = new FileInputStream(file);
        int i = inputStream.read();
        while (i !=-1){
            System.out.print((char) i);
            i = inputStream.read();

        }
        inputStream.close();
        File file1 = new File("persion/NhanVienPartTime.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        String a = "nice to meet you!";
        fileOutputStream.write(a.getBytes());
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file1);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int x = bufferedInputStream.read();
        while (x !=  -1){
            System.out.print((char)x);
            x = bufferedInputStream.read();

        } bufferedInputStream.close();
    }

}
