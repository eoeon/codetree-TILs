import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int prod = 1;
        int i;

        for ( i = 1; i <= n; i++ ) {
            prod *= i;

            if ( prod >= n ) {
                break;
            }
        }

        System.out.print(i);
    }
}