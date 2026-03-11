import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Lütfen bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++)
        {

        for (int l = 1; l <= i; l++) {
            System.out.print("*");
        }
        System.out.println();

                     }
    }
    }


