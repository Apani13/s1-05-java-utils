package level01.exercise5;

public class Main {
    public static void main(String[] args) {
        String filePath = "person.ser";

        Person person = new Person("Michael", 47);

        Serializer.serializePerson(person, filePath);
        Serializer.deserializePerson(filePath);
    }
}
