public class operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 7;

        System.out.print(a++ + b++ + ++c);
        System.out.print("\n");
        System.out.print(a++ + b + c);
        System.out.print("\n");
        System.out.print(a > b && b > c);
        System.out.print("\n");
        System.out.print(a > b || b > c);
        System.out.print("\n");
        System.out.print(a >> 2);
        System.out.print("\n");
        System.out.print(c << 2);
        System.out.print("\n");
        System.out.print(c | b);
        System.out.print("\n");
        System.out.print(a & b);
    }
}