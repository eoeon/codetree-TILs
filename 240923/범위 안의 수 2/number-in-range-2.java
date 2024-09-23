import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int sum1 = 0;
        int sum2 = 0;

        for ( int i = 1; i <= 10; i++ ) {
            int n = sc.nextInt();

            if ( 0 <= n && n <= 200 ) {
                sum1 += n;
                sum2++;
            }
        }

        System.out.print(sum1 + " ");
        System.out.printf("%.1f", ((double)sum1/sum2));
    }
}