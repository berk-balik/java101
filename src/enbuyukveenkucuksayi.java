import java.util.Scanner;
public class enbuyukveenkucuksayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz : ");
        int adet = input.nextInt();

        int n, enbuyuk=0,enkucuk=0;

        for(int i=1;i<=adet;i++){
            System.out.println(i + " . Sayıyı girin : ");
            n = input.nextInt();

            if (i==1){
                enbuyuk=n;
                enkucuk=n;
            }
            else{
                if(n>enbuyuk){
                    enbuyuk = n;
                }
                if (n<enkucuk){
                    enkucuk = n;
                }
            }


        }
        System.out.println("EN BÜYÜK SAYI : "+ enbuyuk);
        System.out.println("EN KÜÇÜK SAYI : "+ enkucuk);
    }
}
