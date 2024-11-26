package Serialization;

import java.io.IOException;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;  // Unique ID

    private String name;
    private int id;
    private transient String password; // transisent means wont be serialized

    public User(String name, int id, String password){
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", password='" + password + "'}";
    }


}
