import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.print(a + " " + b);
    }
}