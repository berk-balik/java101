import java.util.Scanner;

public class ucakbiletifiyatıhesaplama {
    public static void main(String[] args) {
        int km, yas, tip;
        double kmucret = 0.10, ucret, indirimliucret;
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.println("Yapacağınız uçuş uzaklığını km cinsinden giriniz : ");
        km = input.nextInt();
        System.out.println("1 - Tek Yön\n2 - Gidiş ve Dönüş\n Yolculuk tipini giriniz : ");
        tip = input.nextInt();

        if (km <= 0 || yas <= 0 || tip > 2 || tip < 1) { System.out.println("Hatalı Giriş Yaptınız.");}
        else if (yas <= 12) {
            if (tip == 1) { ucret = km * kmucret; indirimliucret = ucret * 0.5; System.out.println("Yolculuk Ücretiniz : " + indirimliucret);}
            else if (tip == 2) { ucret = 2 * km * kmucret; indirimliucret = ucret * 0.3; System.out.println("Yolculuk Ücretiniz : " + indirimliucret);}
        }
        else if (yas>12 && yas<25) {
            if (tip == 1) { ucret = km * kmucret; indirimliucret = ucret * 0.9; System.out.println("Yolculuk Ücretiniz : " + indirimliucret);}
            else if (tip == 2) { ucret = 2 * km * kmucret; indirimliucret = ucret * 0.7; System.out.println("Yolculuk Ücretiniz : " + indirimliucret);}
        }
        else if (yas >= 65) {
            if (tip == 1) { ucret = km * kmucret; indirimliucret = ucret * 0.7; System.out.println("Yolculuk Ücretiniz : " + indirimliucret);}
            else if (tip == 2) { ucret = 2 * km * kmucret; indirimliucret = ucret * 0.5; System.out.println("Yolculuk Ücretiniz : " + indirimliucret);}
        }



    }}
