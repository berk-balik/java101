import java.util.Scanner;

public class artikyilbulma {
    public static void main(String[] args) {
        int yil;
        double dortbolumkln, yuzbolumkln, dortyuzbolumkln;
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı Giriniz : ");
        yil = input.nextInt();

        dortbolumkln = yil % 4;
        yuzbolumkln = yil % 100;
        dortyuzbolumkln = yil % 400;

        if (yil <= 0) {System.out.println("Hatalı Tuşlama yaptınız"); }
        else if (dortbolumkln == 0) {
            if (yuzbolumkln == 0) {
                if (dortyuzbolumkln == 0) {System.out.println(yil + " Artık bir yıldır !");}
                else {System.out.println(yil + " Artık bir yıl değildir !");}
            }
            else {
                System.out.println(yil + " Artık bir yıldır !");
            }
        }
        else {
            System.out.println(yil + " Artık bir yıl değildir !");
        }
    }
}
