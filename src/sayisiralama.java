import java.util.Scanner;
public class sayisiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("1.SAYI : ");
        a = input.nextInt();
        System.out.println("2.SAYI : ");
        b = input.nextInt();
        System.out.println("3.SAYI : ");
        c = input.nextInt();

        if (a>b && a>c){
           if(b>c){ System.out.println("c < b < a");}
            else if(c>b){ System.out.println("b < c < a");}
        }
        if (b>a && b>c){
            if(a>c){ System.out.println("c < a < b");}
            else if(c>b){ System.out.println("a < c < b");}
        }
        if (c>a && c>b){
            if(a>b){ System.out.println("b < a < c");}
            else if(b>a){ System.out.println("a < b < c");}
        }











    }
}
