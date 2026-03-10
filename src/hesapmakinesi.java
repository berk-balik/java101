import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        double a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Girin : ");
        a = input.nextInt();
        System.out.println("İkinci Sayıyı Girin : ");
        b = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminizi Girin");

        int secim;
        secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println(" = " + (a + b));
                break;
            case 2:
                System.out.println(" = " + (a - b));
                break;
            case 3:
                System.out.println(" = " + (a * b));
                break;
            case 4:
                System.out.println(" = " + (a / b));
                break;
            default:
                System.out.println("Doğru bir seçim yapmadınız");

        }
    }
}
