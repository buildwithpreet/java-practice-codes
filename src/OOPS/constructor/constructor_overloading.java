package OOPS.constructor;

import java.sql.SQLOutput;

public class constructor_overloading {
    static class Student {
        String name;
        int age;

        //default constructor
        Student () {
            int age = 19;
            String name = "preet";
        }

            //paramitrized constructor
            Student (String n) {
                name = n;
                age = 19;//default age
            }

            //parameter constructor with name and age
                Student(String n, int a) {
                    name = n;
                    age = a;
                }

                //function to diaplay student class
                    void Display(){
                        System.out.println(name+" "+age);

        }



                }
                public static void main(String[] args) {
        //using default constructor
        Student s1 = new Student();
        s1.Display();

        //using parameter constru with name

        Student s2 = new Student("preet");
        s2.Display();

        //using parameter constru with name and age
        Student s3 = new Student("nikita", 19);
        s3.Display();
                }
            }





