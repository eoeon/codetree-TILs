import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt2 = 0, cnt3 = 0, cnt12 = 0;

        int n = sc.nextInt();

        for ( int i = 1; i <= n; i++ ){

            if ( i % 12 == 0 )
                cnt12++;

            else if ( i % 3 == 0 )
                cnt3++;

            else if ( i % 2 == 0 )
                cnt2++;
        }

        System.out.print( cnt2 + " " + cnt3 + " " + cnt12 );
    }
}