import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f_a = sc.nextInt();
        char f_s = sc.next().charAt(0);
        int s_a = sc.nextInt();
        char s_s = sc.next().charAt(0);

        System.out.print( (f_a >= 19 && f_s == 'M' ) || (s_a >= 19 && s_s == 'M' ) ? "1" : "0" );
    }
}