import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi kaç elemanlı olsun: ");
        int adet = input.nextInt();

        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < adet; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }
    }
}