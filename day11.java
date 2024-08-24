import java.io.*;

class Person implements Serializable
{
}

class Student extends Person {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    int grade;

    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Student person = new Student("John", 30, 10);

        // Serialization
        try {
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student deserializedPerson = (Student) in.readObject();
            in.close();
            fileIn.close();

            // Display deserialized person
            deserializedPerson.display();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
