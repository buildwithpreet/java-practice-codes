package OOPS.Polymorphism;

public class compile_time_polymorphism {
    class Calculator {
        // Method Overloading
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    public class Main {
        public void main(String[] args) {
            Calculator c = new Calculator();
            System.out.println(c.add(5, 10));       // Output: 15
            System.out.println(c.add(5.5, 2.5));    // Output: 8.0
        }
    }

}
