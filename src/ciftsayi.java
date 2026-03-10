import java.util.Scanner;
public class ciftsayi {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;

        do {
            System.out.println("Bir Sayı Giriniz : ");
            Scanner input = new Scanner(System.in);
            sayi = input.nextInt();

            if (sayi%4==0){
                toplam += sayi;
            }
        }while (sayi%2!=1);

        System.out.println("4'ün katı olan sayıların toplamı : "+ toplam);

            }
}
