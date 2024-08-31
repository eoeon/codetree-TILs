import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), n = sc.nextInt();

        for ( int i = 1; i <= n; i++ ) {
            System.out.println( a + (n*i) );
        }
    }
}