import java.util.Scanner;


public class acıyagöredairealanı {
    public static void main(String[] args) {
        int r,derece;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını girin : ");
        r = input.nextInt();
        System.out.print("Daire diliminin derecesini girin : ");
        derece = input.nextInt();

        double alan;

        alan = (pi * r * r) * derece / 360 ;
        System.out.println("Daire diliminin alanı : " + alan);




    }
}


