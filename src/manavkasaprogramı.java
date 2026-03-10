import java.util.Scanner;

public class manavkasaprogramı {
    public static void main(String[] args) {
        double armut =2.14 , elma=3.67, domates=1.11, muz=0.95, patlican = 5;
        double kgarmut,kgelma,kgdomates,kgmuz,kgpatlican,toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Lüften satılan armutun kilogramını girin : ");
        kgarmut = input.nextDouble();

        System.out.print("Lüften satılan elmanın kilogramını girin : ");
        kgelma = input.nextDouble();

        System.out.print("Lüften satılan domatesin kilogramını girin : ");
        kgdomates = input.nextDouble();

        System.out.print("Lüften satılan muzun kilogramını girin : ");
        kgmuz = input.nextDouble();

        System.out.print("Lüften satılan patlıcan kilogramını girin : ");
        kgpatlican = input.nextDouble();

        toplam = (kgarmut * armut) + (kgelma * elma) + (kgdomates * domates) + (kgmuz * muz) + (kgpatlican * patlican);
        System.out.println("Kasaya giren toplam para : " + toplam);


    }
}
