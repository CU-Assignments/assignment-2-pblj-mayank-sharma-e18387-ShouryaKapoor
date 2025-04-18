// Abstract base class
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void displayDetails();
}

// Derived class: Student
class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Details: Name: " + name + " Age: " + age + " Roll Number: " + rollNumber);
    }
}

// Derived class: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details: Name: " + name + " Age: " + age + " Subject: " + subject);
    }
}

// Main class to test
public class StudentSystem {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 101);
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");

        student.displayDetails();
        teacher.displayDetails();
    }
}
