import java.util.*;

class FactorialExample2 {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        int i, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        fact = factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}