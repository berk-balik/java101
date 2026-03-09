import java.util.Scanner;

public class kdvhesaplama {
    public static void main(String[] args) {
        double matrah,kdvTutar,kdvliTutar,kdvOran=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Matrahı Girin : ");
        matrah = input.nextDouble();

        if ( (matrah>0) && (matrah<=1000) ) {
            kdvOran = 0.2;
        }
        else if ( (matrah>1000) ) {
            kdvOran = 0.1;
        }
        else {
            System.out.println("Lütfen geçerli bir sayı giriniz.");
        }


        kdvTutar = matrah * kdvOran;
        kdvliTutar = matrah + kdvTutar;

        System.out.println("Matrah Tutarı : " + matrah);
        System.out.println("Kdv Oranı : " + kdvOran);
        System.out.println("Kdv Tutarı : " + kdvTutar);
        System.out.println("kdv'li Tutar :" + kdvliTutar);




    }
}
