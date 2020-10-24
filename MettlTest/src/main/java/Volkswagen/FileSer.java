package Volkswagen;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileSer implements Serializable {
    private Tree tree = new Tree();

    public static void main(String[] args) {
        FileSer fileSer = new FileSer();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Forest.ser");
            ObjectOutputStream objectInputStream = new ObjectOutputStream(fileOutputStream);
            objectInputStream.writeObject(fileSer);
            objectInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
 class Tree {}