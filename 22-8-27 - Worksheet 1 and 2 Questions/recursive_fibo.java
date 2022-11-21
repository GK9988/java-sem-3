import java.util.*;

class fibonacci {

    static int recursive_fibo(int terms) {

        if (terms == 0 || terms == 1) {
            return terms;
        } else {
            return recursive_fibo(terms - 1) + recursive_fibo(terms - 2);
        }

    }

    public static void main(String args[]) {
        System.out.print("Enter the no. of terms you want: ");
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();

        int newTerm = recursive_fibo(terms - 1);

        System.out.print("\nThe Final term is: " + newTerm);

    }

}