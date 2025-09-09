package OOPS.constructor;

public class paramitrized_constructor {
    static class Student {
        String name;
        int age;

        //paramitrized constructor
        Student (String n,int a){
            name=n;
            age=a;

        }
    }
    public static void main (String [] args) {
        Student s1 = new Student ("preet",19);
        Student s2 = new Student ("nikita",18);
        System.out.println(s1.name+" "+"age is"+s1.age);
        System.out.println(s2.name+" "+s2.age);
    }
}
