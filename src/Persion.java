import java.io.*;

public class Persion implements Serializable{
//    private static final long serialVersionUID = 123124314242L;
    private String id;

    public Persion(String id) {
        this.id = id;
    }

    public Persion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persion persion = new Persion("1");
        File file=new File("persion.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
        objectOutput.writeObject(persion);
        objectOutput.close();
        fileOutputStream.close();
        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Persion p = (Persion) objectInputStream.readObject();
        System.out.println(p.getId());
        objectInputStream.close();
        inputStream.close();

    }
}
