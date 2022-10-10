import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int n, r, i;
        int cr = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Kombinasyon almak için sayıları sırası ile giriniz (n r) :");
        n = input.nextInt();
        r = input.nextInt();

        for (i = 1; i <= r; n--, r--) {
            cr *= n;
            cr /= r;
        }

        System.out.println("C(n,r)= "+cr);
    }
}
