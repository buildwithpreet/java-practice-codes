package OOPS.constructor;

public class default_constructor {
    static class Student{
        String name;
        int age;

        // default constructor (constructor called)
        Student(){
            name="default";
            age=0;

        }

    }
    public static void main(String[] args) {
        //creation of object of student class
        Student s1 = new Student();
        System.out.println(s1.name+" "+s1.age);

    }
}
