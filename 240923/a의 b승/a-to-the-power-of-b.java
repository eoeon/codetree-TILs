import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int prod = 1;

        for ( int i = 1; i <= b; i++ ) {
            prod *= a;
        }

        System.out.print(prod);


    }
}