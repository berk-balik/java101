import java.util.Scanner;
public class sınıfgecmedersortalama {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,muz;
        Scanner input = new Scanner(System.in);
        float sum=0,counter=0,realAverage;

        System.out.println("Matematik Notuzu Girniz : ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100){ sum = sum + mat; counter = counter + 1; }
        else { System.out.println("Geçersiz Sayı Girdiniz\n Matematik dersi ortalamaya dahil edilmemiştir.");}

        System.out.println("Fizik Notuzu Girniz : ");
        fiz = input.nextInt();
        if (fiz>=0 && fiz<=100){ sum = sum + fiz; counter = counter + 1; }
        else { System.out.println("Geçersiz Sayı Girdiniz\n Fizik dersi ortalamaya dahil edilmemiştir."); }

        System.out.println("Kimya Notuzu Girniz : ");
        kim = input.nextInt();
        if (kim>=0 && kim<=100){ sum = sum + kim; counter = counter + 1; }
        else { System.out.println("Geçersiz Sayı Girdiniz\n Kimya dersi ortalamaya dahil edilmemiştir."); }

        System.out.println("Türkçe Notuzu Girniz : ");
        tur = input.nextInt();
        if (tur>=0 && tur<=100){ sum = sum + tur; counter = counter + 1; }
        else { System.out.println("Geçersiz Sayı Girdiniz\n Türkçe dersi ortalamaya dahil edilmemiştir."); }

        System.out.println("Müzik Notuzu Girniz : ");
        muz = input.nextInt();
        if (muz>=0 && muz<=100){ sum = sum + muz; counter = counter + 1; }
        else { System.out.println("Geçersiz Sayı Girdiniz\n Müzik dersi ortalamaya dahil edilmemiştir."); }

        realAverage = sum / counter;
        System.out.println("Sınıf Ortalamanız : " + realAverage);
        if (realAverage>=55) {
            System.out.println("Geçtiniz");
        }
        else if (55>realAverage) {
            System.out.println("Kaldınız");

        }
        else {
            System.out.println("Geçersiz İşlem");
        }


    }
}
