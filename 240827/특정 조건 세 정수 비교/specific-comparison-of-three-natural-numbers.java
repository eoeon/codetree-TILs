import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int d;

        if ( a <= b && a <= c ) {
            d = a;
        }

        else if ( b <= a && b <= c ) {
            d = b;
        }

        else if ( c <= a && c <= b ) {
            d = c;
        }

        if ( a == d ) {
            System.out.print("1");
        }

        else {
            System.out.print("0");
        }

        if ( a == b && b == c ) {
            System.out.print("1");
        }

        else {
            System.out.print("0");
        }
    }
}