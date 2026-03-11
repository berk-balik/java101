import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        int k1,k2;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayı:");
        k1 = input.nextInt();
        System.out.print("2. Sayı:");
        k2 = input.nextInt();

        int ebob,ekok;
        int b = Math.min(k1, k2);
        while(true){
            if ((k1%b==0)&& (k2%b==0)){
                ebob = b;
                break;
            }
            b--;
        }
        int a = Math.max(k1, k2);
        while(true){
            if ((a%k1==0)&&(a%k2==0)){
                ekok = a;
                break;
            }
            a++;
        }
        System.out.println(ebob);
        System.out.println(ekok);


    }
}
