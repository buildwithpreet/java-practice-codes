package OOPS.Polymorphism;

public class method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(1,2);
        System.out.println(calc.add(1,2));
        System.out.println(calc.add((float)3.5,(float)1.5));
        System.out.println(calc.add(1,2,3));



    }
    static class Calculator {
        //function 1
        int add(int a, int b) {
            return a + b;
        }
          //function 2
        float add(float a, float b) {
            return a + b;
        }

        //function 3
        int add(int a, int b, int c) {
            return a + b + c;

        }
    }
}



