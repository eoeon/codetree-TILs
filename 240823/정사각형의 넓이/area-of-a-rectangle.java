import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = n*n;

        System.out.println(e);

        if(n<5) {
            System.out.print("tiny");
        }
    }
}