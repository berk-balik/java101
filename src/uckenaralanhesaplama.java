import java.util.Scanner;

public class uckenaralanhesaplama {
    public static void main(String[] args) {
        double a,b,c;
        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextDouble();

        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextDouble();

        System.out.print("3. Kenarı Giriniz : ");
        c = girdi.nextDouble();

        double u = (a + b + c) / 2 ;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Alanı : " + alan);



    }
}
