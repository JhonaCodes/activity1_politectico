public class ExampleIndicators {
    public static void main(String[] args) {
        // Indicator 1: Explain characteristics of programming languages, types of operators, and expressions
        System.out.println("Indicator 1:");
        System.out.println("Programming languages have characteristics such as static or dynamic typing, compilation or interpretation, among others.");
        System.out.println("Operators in Java include arithmetic (+, -, *, /), assignment (=), comparison (==, !=, <, >, <=, >=), logical (&&, ||, !), among others.");
        System.out.println("Expressions can be arithmetic, boolean, assignment, among others, according to classification.");

        // Indicator 2: Build arithmetic and boolean expressions
        System.out.println("\nIndicator 2:");
        int a = 10;
        int b = 5;
        int arithmeticResult = a + b * 2; // Arithmetic expression
        boolean booleanResult = (a > b) && (a % 2 == 0); // Boolean expression
        System.out.println("Arithmetic expression: " + arithmeticResult);
        System.out.println("Boolean expression: " + booleanResult);

        // Indicator 3: Solve problems using program flow control structures like if
        System.out.println("\nIndicator 3:");
        int age = 20;
        if (age >= 18) {
            System.out.println("The person is of legal age.");
        } else {
            System.out.println("The person is underage.");
        }

        // Indicator 4: Use control structures like if, if-else, switch, for, while, and do-while
        System.out.println("\nIndicator 4:");
        // Example of using for loop
        System.out.println("Example of using for loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + (i + 1));
        }

        // Example of using while loop
        System.out.println("\nExample of using while loop:");
        int counter = 0;
        while (counter < 3) {
            System.out.println("Iteration " + (counter + 1));
            counter++;
        }

        // Example of using do-while loop
        System.out.println("\nExample of using do-while loop:");
        int anotherCounter = 0;
        do {
            System.out.println("Iteration " + (anotherCounter + 1));
            anotherCounter++;
        } while (anotherCounter < 2);
    }
}
