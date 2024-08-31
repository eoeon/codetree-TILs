import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int n = a/b;

        System.out.print(n + ".");

        
        a%= b;
        for ( int i = 0; i < 20; i++ ) {
            a *= 10;
            System.out.print(a / b);

            a %= b;
        }
    }
}