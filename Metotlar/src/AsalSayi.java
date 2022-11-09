import java.util.Scanner;

public class AsalSayi {
    static int i = 2;

    static boolean isPrime(int n) {
        if (n % i == 0 && n != 2 || n==1)
            return false;
        if (i >= n / 2)
            return true;
        i++;
        return isPrime(n);
    }

    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n = inp.nextInt();
        inp.close();

        System.out.println(isPrime(n) ?
                (n + " sayısı ASALDIR !") :
                (n + " sayısı ASAL değildir !"));
    }
}
