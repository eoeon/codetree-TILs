import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble();

        if ( a >= 1.0 && b >= 1.0 ) {

            System.out.println("High");
        }

        else if ( 0.5 <= a && a < 1.0 && 0.5 <= b && b < 1.0 ) {

            System.out.println("Middle");
        }
        
        else { 
            System.out.println("Low" );
        }

    }
}