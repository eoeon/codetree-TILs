import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int AM = sc.nextInt(), AE = sc.nextInt();
        int BM = sc.nextInt(), BE = sc.nextInt();

        System.out.print( AM > BM && AE > BE ? 1 : 0);
    }
}