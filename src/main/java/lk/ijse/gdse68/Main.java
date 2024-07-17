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

        // deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/animal.ser"))) {
            Animal deserializedAnimal = (Animal) ois.readObject();
            System.out.println("Deserialization successful : " + deserializedAnimal);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}