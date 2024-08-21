import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("-");

        int first = sc.nextInt();
        int xxxx = sc.nextInt();
        int yyyy = sc.nextInt();

        System.out.print("010" + "-" + yyyy + "-" + xxxx);
    }
}