package task2;

public class runner {
        public static void main(String[] args) {
            Student student1=new Student("student1", "st1", (byte) 28);
            Student student2=new Student("student2", "st2", (byte) 34);
            Student student3=new Student("student3", "st3", (byte) 15);
            Student student4=new Student("student4", "st4", (byte) 20);

            Student[] student={student1, student2, student3, student4};

            System.out.println("    имя  фамилия  возраст группа");
            for (Student value : student) {
                System.out.print(value.name + " " + value.surname + " " + value.age + " " + value.group + "\n");
            }
        }
}
