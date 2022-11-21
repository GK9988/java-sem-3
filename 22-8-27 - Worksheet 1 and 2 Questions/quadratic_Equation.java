import java.util.*;
import java.lang.Math;

class Quadratic {
    static void quadSolver(int a, int b, int c) {
        double discriminant = (b * b) - (4 * a * c);
        double D = Math.sqrt(discriminant);

        if (discriminant < 0) {
            System.out.print("\nThere are no real roots for the equation");
        } else {
            double root1 = (D - b) / (2 * a);
            double root2 = (0 - b - D) / (2 * a);

            System.out.print("\nRoot 1: " + root1);
            System.out.print("\nRoot 2: " + root2);

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the Value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the Value of c: ");
        int c = sc.nextInt();

        quadSolver(a, b, c);

    }
}