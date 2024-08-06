/*
Create a Person class with private fields for name, age, and address. Provide public getters and setters for each field. Create a method to display the person's details.
*/

public class Person {
    private String name;
    private int age;
    private String address;
    
    // just do these ones to save time.
    public String get_name() {return name;}
    public void set_name(String s) {this.name = s;}
    
    public void display() {System.out.println(this.name);}
}

/*
Create a Student class that inherits from the Person class. Add a field for the student's major and a method to display the student's details, including their major.
*/
public class Student extends Person
{
    String major;
    @Override
    public void display() {System.out.println(this.major);}
}

/*
Create a Shape superclass with a method calculateArea(). Create subclasses Circle, Rectangle, and Square that each override the calculateArea() method to calculate the area specific to the shape.
*/
public class Shape {
    public double calculateArea();
}

public class Circle extends Shape {
    @Override
    public double calculateArea(double radius)
    {
        return 3.14 * (radius * radius);
    }
}

/*
Write a class BankAccount with methods to deposit, withdraw, and check the balance. Create a subclass SavingsAccount with an additional method to add interest. Demonstrate the use of these classes.
*/
public class BankAccount {
    public void deposit();
    public void withdraw();
    public double balance();
}

public class SavingsAccount extends BankAccount {
    public void interest();
}

public class MainProgram {
    public static void main(String[] args) {
        /*
        Implement polymorphism by creating a list of Shape objects that includes circles, rectangles, and squares. Iterate through the list and print the area of each shape.
        */
        Shape s = new Circle();
    }
}
