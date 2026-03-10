import java.util.Scanner;
public class satininbasamakdegerlerinintoplami {
    public static void main(String[] args) {
        int sayi,basamaksayac=0;

        Scanner input = new Scanner(System.in);
        System.out.println( "Bir sayı girin : ");
        sayi =input.nextInt();
        int sayi2=sayi,yenisayi = 0, toplam=0 ;

        while (sayi2!=0){
            sayi2 /= 10;
            basamaksayac = basamaksayac+1;

        }

        for (int i=1; i<=basamaksayac; i++){

            yenisayi = (sayi%10);
            sayi /= 10;

            toplam +=yenisayi;

        }
        System.out.println(toplam);


    }
}
