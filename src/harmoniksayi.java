import java.util.Scanner;
public class harmoniksayi {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        n = input.nextInt();
        double toplam = 0;

        for (double i=1; i<=n;i++){

            toplam += ((double) 1/i);



        }   System.out.println(toplam);
    }
}
