class Student {
    int id;
    String name;
    double marks;

    Student() {
        id = 0;
        name = "Unknown";
        marks = 0.0;
    }

    Student(int id) {
        this.id = id;
        name = "Unknown";
        marks = 0.0;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        marks = 0.0;
    }

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(102, "Anu");
        Student s4 = new Student(103, "Ravi", 89.5);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
