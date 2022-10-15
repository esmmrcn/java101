import java.util.Scanner;

public class BasamakSayilariToplam {
    public static void main(String[] args) {

        int sayi,toplam=0;

        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();

        while (sayi!=0) {
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("Basamak sayılarının toplamı: "+toplam);
    }
}