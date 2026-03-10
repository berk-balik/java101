import java.util.Scanner;
public class ucvedordetambolunensayilarinortalamasi {
    public static void main(String[] args) {
        int k,adet=0,toplam=0,i;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin : ");
        k = input.nextInt();

        for (i = 1; i<=k; i++){
            if (i>0 && i%4==0 && i%3==0){

                System.out.println(i + " ");

                adet++;
                toplam +=i;
            }
        }

            System.out.println("Girilen tutardan küçük 3'e ve 4'e tam bölünen sayıların toplamının ortlalaması " + toplam/adet);

    }
}
