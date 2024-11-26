package Serialization;

import java.io.*;

public class Deserialize {
    public static void main(String[] args){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            User emp = (User) ois.readObject(); // Deserialize the object
            System.out.println("Deserialization complete. Employee object: " + emp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
