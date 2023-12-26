package src.Util;

import java.io.*;

public class SaveDataBase implements Serializable {
    static {
        if (new File("data.ser").exists()) {
            try {
                Database.instance = readData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Database.instance = new Database();
        }
    }

    static Database readData() throws Exception {
        FileInputStream fis = new FileInputStream("data.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        @SuppressWarnings("unchecked")
        Database d = (Database) ois.readObject();
        
        fis.close();
        ois.close();

        return d;
    }

    static void saveData(Database d) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d);

        fos.close();
        oos.close();
    }
}
