import java.util.*;

class fibonacci {

    static int fibo(int terms){
		int a = 0;
		int b = 1;
		int term = 0;
		
		if(terms == 1){
			System.out.print("\nSeries: "+ a);
			return a;
		} else if(terms == 2){
			System.out.print("\nSeries: " + a + " " + b);
			return b;
		} else{
			System.out.print("\nSeries: " + a + " " + b + " ");
			for(int i = 0; i < terms - 2; i++){
				term = a + b;
				a = b;
				b = term;
				System.out.print(term + " ");
				
			}
			return term;
		}
	}

    public static void main(String args[]){
		System.out.print("Enter the no. of terms you want: ");
		Scanner sc = new Scanner(System.in);
		int terms = sc.nextInt();

		int newTerm = fibo(terms);

		System.out.print("\nThe Final term is: " + newTerm);
		
	}

}