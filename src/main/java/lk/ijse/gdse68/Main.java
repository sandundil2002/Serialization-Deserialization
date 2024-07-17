package lk.ijse.gdse68;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", 2);

        // serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animal.ser"))) {
            oos.writeObject(animal);
            System.out.println("Serialization successful : " + animal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}