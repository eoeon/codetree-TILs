import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt(), a = sc.nextInt();
        int i = b;

        while ( i >= a ) {
            System.out.print( i + " " );
            i -= 2;
        }
    }
}