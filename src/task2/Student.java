package task2;

/**
 * I created a “student” class with the parameters “first name”, “last name”, “age”, “group” and a constructor for them
 */
public class Student {
    String name;
    String surname;
    Byte age;
    String group="C-27 Java";

    public Student(String name, String surname, Byte age){
        this.name= name;
        this.surname= surname;
        this.age=age;
    }
}

