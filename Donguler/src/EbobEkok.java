import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1 = 0, n2 = 0;
        int ebob, ekok = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz :");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz :");
        n2 = input.nextInt();

        if (n1 < n2) {
            ebob = n1;
        } else {
            ebob = n2;
        }

        while (n1 % ebob != 0 || n2 % ebob != 0) {
            ebob--;
        }

        int n1Katlari = n1;
        int n2Katlari = n2;
        
        while (n1Katlari != n2Katlari) {
            if (n1Katlari < n2Katlari) {
                n1Katlari += n1;
            } else {
                n2Katlari += n2;
            }
        }
        ekok = n1Katlari;

        System.out.println("Ebob :" + ebob);
        System.out.println("Ekok :" + ekok);
    }
}
