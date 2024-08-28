import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mS = sc.nextInt(), mH = sc.nextInt();

        if ( mS < 90 ) {
            System.out.print("0");
        }

        else if ( mH >= 95 ) {
            System.out.print("100000");
        }

        else{ ( mH >= 90 )
            System.out.print("50000");
        }


    }
}