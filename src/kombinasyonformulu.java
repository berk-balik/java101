import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class kombinasyonformulu {
    public static void main(String[] args) {
        int n,r;
        Scanner input = new Scanner(System.in);
        System.out.println("KOMBİNASYON HESABI \n n değeri giriniz : ");
        n = input.nextInt();
        System.out.println("r değeri giriniz : ");
        r = input.nextInt();

        double topr=1,topn=1,topnr=1;

        for (int i=1; i<=n;i++){
            topn= topn*i;

        }
        for (int i=1; i<=r;i++){
            topr= topr*i;

        }
        for (int i=1; i<(n-r);i++){
            topnr= topnr*i;

        }
        System.out.println("n! : " + topn);
        System.out.println("r! : " + topr);

        System.out.println("Kombinasyon sonucu : " + topn/(topr*topnr));









    }
}
