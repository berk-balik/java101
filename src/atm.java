import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bakiye= 1500,hak=3,secim,islemtutari;
        String ad,sifre;
        System.out.println("ATM' ye hoşgeldiniz. ");

        for (int i=1 ;i<=hak;  i++){

            System.out.print("Kullanıcı adınızı giriniz : ");
            ad = input.nextLine();
            System.out.print("Şifrenizi girniz : ");
            sifre = input.nextLine();
            if(!ad.equals("patika")|| !sifre.equals("123")){
                System.out.println("Yanlış kullanıcı adı veya şifre girdiniz. Tekrar deneyin.");
            }
            if (i == 3){
                System.out.println("Yanlış giriş yaptığınızdan dolayı hesabıza bloke konulmuştur. Bankayla iletişeme geçiniz.");
            }

            if (ad.equals("patika")&& sifre.equals("123")){

                System.out.println("Giriş Başarılı");
                do {
                    System.out.println("MENÜ\n1 - PARA YATIRMA\n2 - PARA ÇEKME\n3 - BAKİYE SORGULAMA\n4 - ÇIKIŞ");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();
                    switch (secim){
                        case 1:
                            System.out.println("Yapmak istediğiniz işlem tutarını girin.") ;
                            islemtutari = input.nextInt();
                            bakiye += islemtutari;
                            System.out.println("Yeni Bakiyeniz : "+bakiye);
                            break;
                        case 2:
                            System.out.println("Yapmak istediğiniz işlem tutarını girin.") ;
                            islemtutari = input.nextInt();
                            if (islemtutari<=bakiye){
                                bakiye -= islemtutari;
                                System.out.println("Yeni Bakiyeniz : "+bakiye);
                            }
                            else {
                                System.out.println("Yeterli bakiyeniz yok");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : "+bakiye);
                            break;
                        case 4:
                            System.out.println("İyi Günler, Görüşmek Üzere");
                            break;
                        default:
                            System.out.println("Hatalı tuşlama yaptınız.");


                    }

                } while(secim!=4);
                break;
            }

        }









        }
    }


