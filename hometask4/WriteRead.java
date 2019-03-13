package hometask4;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by MacUser on 11.03.19.
 */
public class WriteRead {
    public static void saveGroupToFile(File file, Group group) throws IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(group);
        }catch (IOException e){
            throw e;
        }
    }

    public static Object loadGroupFromFile(File file) throws IOException, ClassNotFoundException{
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            return  ois.readObject();
        }catch (IOException | ClassNotFoundException  e){
            throw e;
        }
    }
}
