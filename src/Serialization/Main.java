package Serialization;

import java.io.FileOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args){

        /*
        Steps to Serialize

        1. Your object class should implement Serializable interface
        2. add import java.io.SErializable
        3. FileOutputStream fileOut = new FileOutputStream(file path)
        4. ObjectOutputStream out = new ObjectOutputStream(fileOut)
        5. out.writeObject(objectName)
        6. out.close(); fileout.close();
         */

        //SerialVersionUID =	serialVersionUID is a unique ID that functions like a version #
        //					verifies that the sender and receiver of a serialized object,
        //					have loaded classes for that object that are compatible
        //					Ensures object will be compatible between machines
        //					Number must match. otherwise this will cause a InvalidClassException
        //					A SerialVersionUID will be calculated based on class properties, members, etc.
        //					A serializable class can declare its own serialVersionUID explicitly (recommended)

        User emp = new User("John Doe", 101, "secret123");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp); // Serialize the object
            System.out.println("Serialization complete. Data saved to employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Cakow\\eclipse-workspace\\SerializeDemo\\employee.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(user);
//
//            out.close();
//            fileOut.close();
//            System.out.println("Object saved!");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
//
//        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
//        System.out.println("serialVersionUID: "+serialVersionUID);
//    }
}
    }

