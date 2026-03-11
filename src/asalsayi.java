public class asalsayi {
    public static void main(String[] args) {

        for (int n=2;n<=100;n++){

            boolean asalmi = true;

            for (int i=2; i<n;i++){
                if (n%i==0){
                    asalmi = false;
                    break;
                }


            }
            if (asalmi) {

                System.out.print(n + " ");
            }














        }
    }
}
