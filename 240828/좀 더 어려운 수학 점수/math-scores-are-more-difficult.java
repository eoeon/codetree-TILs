import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aM = sc.nextInt(), aE = sc.nextInt(), bM = sc.nextInt(), bE = sc.nextInt();

        if ( aM > bM ) {
            System.out.print("A");
        }

        else if ( bM > aM ) {
            System.out.print("B");
        }

        else if ( aE > bE ) {
            System.out.print("A");
        }

        else {
            System.out.print("B");
        }
    }
}