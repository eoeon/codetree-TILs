import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;

        for ( int i = a; i <= b; i++ ) {

            if ( i % 5 == 0 || i % 7 == 0 ) {
                sum1 += i;
                sum2++;
            }
        }

        System.out.print(sum1 + " ");
        System.out.printf( "%.1f", (double) sum1/sum2 );
    }
}