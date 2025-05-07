class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    void show() {
        System.out.println("Calculator class method");
    }
}

class AdvancedCalculator extends Calculator {
    void show() {
        System.out.println("AdvancedCalculator class method");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator basic = new Calculator();

        System.out.println("Int Add: " + basic.add(5, 3));
        System.out.println("Double Add: " + basic.add(2.5, 3.1));
        System.out.println("String Add: " + basic.add("Hi ", "There"));

        basic.show();

        AdvancedCalculator adv = new AdvancedCalculator();
        adv.show();
    }
}