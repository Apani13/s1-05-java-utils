package level01.exercise5;

import java.io.*;

public class Serializer {

    public static void serializePerson(Person person, String filePath) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(person);
            System.out.println("Person object serialized to " + filePath);
        } catch (IOException e) {
            System.out.println("Error serializing object");
            e.printStackTrace();
        }
    }

    public static void deserializePerson(String filePath) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Person person = (Person) in.readObject();
            System.out.println("Deserialized Person:");
            System.out.println(person.toString());

            //separar las excepciones para que devuelvan mensajes diferentes
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing object");
            e.printStackTrace();
        }
    }
}
