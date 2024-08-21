import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();

        l += 8;
        h *= 3;

        System.out.println(l);
        System.out.println(h);
        System.out.println(l * h);
    }
}