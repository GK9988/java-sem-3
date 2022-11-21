import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] uniqueArr = new int[100];
        int[] count = new int[100];
        int countIndex = 0;

        int len;
        int flag;

        System.out.println("How many elements do you want to enter: ");
        len = sc.nextInt();

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < len; i++) {
            flag = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                uniqueArr[countIndex] = arr[i];
                countIndex++;
            }
        }

        for (int i = 0; i < countIndex; i++) {
            int num = uniqueArr[i];
            for (int j = 0; j < len; j++) {
                if (arr[j] == num) {
                    count[i]++;
                }
            }
        }

        System.out.println("Unique Elements and their occurances in the array:  \n");

        System.out.print("Array: ");
        for (int i = 0; i < countIndex; i++) {

            System.out.print(uniqueArr[i]);
            System.out.print(" ");

        }
        System.out.print("\n");
        System.out.print("Count: ");

        for (int i = 0; i < countIndex; i++) {
            System.out.print(count[i]);
            System.out.print(" ");
        }

    }
}