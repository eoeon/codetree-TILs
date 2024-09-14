import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;

        while ( i <= n ) {

            if ( i % 3 == 0 ) {
                System.out.print(0 + " ");
                i++;
            }

            else if ( 30 <= i && i <= 39 ) {
                System.out.print(0 + " ");
                i++;
            }

            else if ( 60 <= i && i <= 69 ) {
                System.out.print(0 + " ");
                i++;
            }

            else if ( 90 <= i && i <= 99 ) {
                System.out.print(0 + " ");
                i++;
            }

            else if ( i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) {
                System.out.print(0 + " ");
                i++;
            }

            else {
                System.out.print(i + " ");
                i++;
            }


        }
    }
}