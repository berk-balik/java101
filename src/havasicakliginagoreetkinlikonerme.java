import java.util.Scanner;
public class havasicakliginagoreetkinlikonerme {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } if (heat >= 5 && 15 >= heat) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } if (heat >= 15 && 25 >= heat) {
            System.out.println("Piknik yapabilirsiniz.");
        } if (heat > 25) {
            System.out.println("Yüzme yapabilirsiniz.");
        }}

    }

