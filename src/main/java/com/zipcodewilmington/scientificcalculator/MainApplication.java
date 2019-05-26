package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    Console console;

    public MainApplication() {
        this.console = new Console();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public double modulo(double a, double b) {
        return a % b;
    }

    public double exponent(double a, double b) {
        return Math.pow(a, b);
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double sin(double a) {
        return Math.sin(a);
    }

    public double asin(double a) {
        return Math.asin(a);
    }

    public double cos(double a) {
        return Math.cos(a);
    }

    public double cosh(double a) {
        return Math.cosh(a);
    }

    public double sinh(double a) {
        return Math.sinh(a);
    }

    public double acos(double a) {
        return Math.acos(a);
    }

    public double tan(double a) {
        return Math.tan(a);
    }

    public double atan(double a) {
        return Math.atan(a);
    }

    public double tanh(double a) {
        return Math.tanh(a);
    }

    public double theta(double a, double b) {
        return Math.atan2(a, b);
    }

    public double cubicRoot(double a) {
        return Math.cbrt(a);
    }

    public double reciprocal(double a) {
        return 1 / a;
    }

    public double inverse(double a) {
        return -a;
    }

    public double factorial(double a) {
        double f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public double gcd(double a, double b) {
        double gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;

    }

    public double lcm(double a, double b) {
        return (a * b) / gcd(a, b);
    }

    public void run() {
        boolean on = true;
        Console console = new Console();
        console.println("Let's CALCULATE!\n");
        Double a = console.getDoubleInput("Enter a number: ");

        while (on) {
            console.println("\n[+]  [-]  [*]  [/]  [%%]  [^2]  [^x]  [sqrt]  [cbrt]  [!]");
            console.println("[sin]  [cos]  [tan]  [sinh]  [cosh]  [tanh]  [asin]  [acos]  [atan]");
            console.println("[changeunits]  [radians]  [degrees]");
            console.println("[theta]  [reciprocal]  [inverse]  [gcd]  [lcm]\n");
            String s = console.getStringInput("Enter an operator: ");
            Double result = 0.0;

            switch (s) {
                case "+":
                case "add":
                case "sum":
                case "plus":
                    double addb = console.getDoubleInput("\nEnter a second number");
                    result = console.add(a, addb);
                    console.println("\n%s + %s = %s", String.format("%s", a), String.format("%s", addb), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "-":
                case "subtract":
                case "minus":
                    double subB = console.getDoubleInput("\nEnter a second number");
                    result = console.subtract(a, subB);
                    console.println("\n%s - %s = %s", String.format("%s", a), String.format("%s", subB), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "/":
                case "divide":
                case "divided by":
                    double divB = console.getDoubleInput("\nEnter a second number");
                    if (divB == 0) {
                        console.changeDisplay("Error");
                        console.println("Error.  Cannot divide by 0.");
                    } else {
                        result = console.divide(x, divY);
                        console.println("\n%s / %s = %s", String.format("%s", a), String.format("%s", divY), String.format("%s", result));
                        console.changeDisplay(result.toString());
                    }

                    break;

                case "*":
                case "times":
                case "multiply":
                    double multiB = console.getDoubleInput("\nEnter a second number");
                    result = console.multiply(a, multiB);
                    console.println("\n%s * %s = %s", String.format("%s", a), String.format("%s", multiB), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "%":
                case "mod":
                case "remainder":
                    double modB = console.getDoubleInput("\nEnter a second number");
                    result = console.modulo(a, modB);
                    console.println("\n%s %% %s = %s", String.format("%s", a), String.format("%s", modB), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "^x":
                case "^":
                    double expoB = console.getDoubleInput("\nEnter a second number");
                    result = console.exponent(a, expoB);
                    console.println("\n%s ^ %s = %s", String.format("%s", a), String.format("%s", expoB), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "^2":
                    result = console.exponent(a, 2);
                    console.println("\n%s ^2 = %s", String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "sin":
                    result = console.sin(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "asin":
                    result = console.asin(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "sinh":
                    result = console.sinh(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "cos":
                    result = console.cos(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "acos":
                    result = console.acos(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "cosh":
                    result = console.cosh(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "tan":
                    result = console.tan(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "atan":
                    result = console.atan(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "tanh":
                    result = console.tanh(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "theta":
                    double thetaB = console.getDoubleInput("\nEnter a second number");
                    result = console.theta(thetaB, a);
                    console.println("\n%s theta %s = %s", String.format("%s", a), String.format("%s", thetaB), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "sqrt":
                case "root":
                case "square root":
                    result = console.squareRoot(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "cbrt":
                    result = console.cubicRoot(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;


                case "changeunits":
                    while (s.equals("changeunits")) {
                        console.changeDisplay("" + a);
                        console.switchUnitsMode();
                        console.println(console.getCurrentDisplay() + "\n");
                        s = console.getStringInput("Enter \"changeunits\" to switch mode again or enter \"back\" to go back.\n");
                    }
                    break;

                case "degrees":
                    console.changeDisplay("" + a);
                    console.switchUnitsMode(s);
                    console.println(console.getCurrentDisplay());

                    break;

                case "radians":
                    console.changeDisplay("" + a);
                    console.switchUnitsMode(s);
                    console.println(console.getCurrentDisplay());

                    break;

                case "reciprocal":
                case "1/x":
                    result = reciprocal(a);
                    console.println("\n1 / %s = %s", String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "inverse":
                    result = inverse(a);
                    console.println("\n%s %s = %s", s, String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "factorial":
                case "!":
                    result = factorial(a);
                    console.println("\n%s! = %s", String.format("%s", a), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "gcd":
                    double gcdB = console.getDoubleInput("\nEnter a second number");
                    result = console.gcd(a, gcdB);
                    console.println("\ngcd(%s, %s) = %s", String.format("%s", a), String.format("%s", gcdB), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "lcm":
                    double lcmB = console.getDoubleInput("\nEnter a second number");
                    result = console.lcm(a, lcmB);
                    console.println("\nlcm(%s, %s) = %s", String.format("%s", a), String.format("%s", lcmB), String.format("%s", result));
                    console.changeDisplay(result.toString());

                    break;

                case "clear":
                case "c":
                    console.clearDisplay();
                    console.println("\n0.0");

                    break;

                default:
                    console.println("Error: enter a proper operator");
                    result = 0.0;
            }

//    public static void main(String[] args) {
//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
//        }
        }
    }
}
