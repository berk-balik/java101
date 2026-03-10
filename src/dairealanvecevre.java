import java.util.Scanner;


public class dairealanvecevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenein yarıçapını giriniz : ");
        r = input.nextInt();

        double dairealan = pi * r * r ;
        double dairecevre = 2 * pi * r ;

        System.out.println("Dairenin Alanı : " + dairealan);
        System.out.println("Dairenin Çevresi : " + dairecevre);


    }
}
