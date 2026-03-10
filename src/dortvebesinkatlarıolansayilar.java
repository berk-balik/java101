import java.util.Scanner;

public class dortvebesinkatlarıolansayilar {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();


        System.out.println(sayi + "sayısında küçük 4'ün katları ");
        for (int i=1; i<=sayi; i*=4) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------------------------------------");


        System.out.println(sayi + "sayısında küçük 5'ün katları ");
        for (int i=1; i<=sayi; i*=5) {
            System.out.println(i);
        }
    }
}
