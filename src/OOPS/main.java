package OOPS;

public class main {
    static class Student {
        //properties
        String name;
        int age;
        //methods
        void study() {
            System.out.println(name + " "+"is studying");
            System.out.println(age + " "+"is its age");
        }

    }
    public static void main(String[] args) {
        //creting obj of student class
        Student s1 = new Student();
        //asigning values to new variable s1 of obj properties
        s1.name="aradhya";
        s1.age=18;
        s1.study(); //calling methods

    }
}
