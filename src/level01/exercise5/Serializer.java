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

            if (person != null) {
                System.out.println("Deserialized Person:");
                System.out.println(person);
            } else {
                System.out.println("No person was deserialized.");
            }

        } catch (IOException e) {
            System.out.println("Error deserializing object from file: " + filePath);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error deserializing object, class not found");
            e.printStackTrace();
        }
    }
}
