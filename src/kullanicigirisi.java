import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {
        String userName,Password;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.println("Şifrenizi Giriniz : ");
        Password = input.nextLine();
        if (userName.equals("Berk") && Password.equals("123456") )  {
            System.out.println("Giriş Başarılı");        }
        else {
            System.out.println("Hatalı Tuşlama Yaptınız\n\nŞifre Değiştirilsin Mi?\n 1 - EVET\n 2 - HAYIR");
            int secim;
            Scanner input2 = new Scanner(System.in);
            secim = input2.nextInt();
            switch(secim) {
                case 1:
                    String yenisifre;
                    System.out.println("Yeni Şifrenizi Giriniz : ");
                    Scanner input3 = new Scanner(System.in);
                    yenisifre = input3.nextLine();

                    if (yenisifre.equals("123456")) {
                        System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz!\n Programı tekrar başlatın. ");
                    }
                    else if (!yenisifre.equals("123456")) {
                        System.out.println("Yeni şifreniz başarılı bir şekilde oluşturuldu.\n Programı yeniden başlatın.");
                    }
                    break;

                    case 2:
                        System.out.println("Giriş yapmak için programı tekrar başlatınız.");

                    break;
                default:
                    System.out.println("Hatalı Tuşlama Yaptınız.");}







            }

        }


    }

