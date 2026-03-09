import java.util.Scanner;

public class dersortalama {
    public static void main(String[] args) {
        int mat, fiz, kim, biy, res, muz;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuzu girin = ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu girin = ");
        fiz = input.nextInt();

        System.out.print("Kimya notunuzu girin = ");
        kim = input.nextInt();

        System.out.print("Biyoloji notunuzu girin = ");
        biy = input.nextInt();

        System.out.print("Resim notunuzu girin = ");
        res = input.nextInt();

        System.out.print("Müzik notunuzu girin = ");
        muz = input.nextInt();

        double toplam=mat+fiz+kim+biy+res+muz;
        double sonuc=toplam/6;
        System.out.println("Ortalamanız" + sonuc);
        System.out.println(sonuc>60  ? "Geçti":"Kaldı");




    }
}