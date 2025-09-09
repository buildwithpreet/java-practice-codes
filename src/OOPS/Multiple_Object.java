package OOPS;

public class Multiple_Object {
    private static class Student{
       //properties
       int age;
       String name;

       //methods or functions
       void study(){
           System.out.println(name+" "+ "Is studying");
           System.out.println(age+" "+"is its age");
       }
           
           void bunking(){
               System.out.println(name+" "+ "Is bunking");
               System.out.println(age+" "+"is its age");
           }
       }
       public static void main (String[]args){
       //creating of object of student class
       //1 object
       Student s1 = new Student();

       s1.name="preet";
       s1.age=20;

       //2 object
       Student s2 = new Student();
       s2.name="bharti";
       s2.age=19;

       s1.study();
       s2.bunking();


    }
}
