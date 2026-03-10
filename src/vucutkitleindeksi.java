import java.util.Scanner;


public class vucutkitleindeksi {
    public static void main(String[] args) {
        float boy,kilo,indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy = input.nextFloat();
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz : ");
        kilo = input.nextFloat();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut kilo indeksiniz : " + indeks );


    }
}
