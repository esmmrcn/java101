import java.util.Scanner;

//N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

public class ArmstronSayi {
    public static void main(String[] args) {

        int sayi, sayiDeneme, sayiKontrol = 0;
        int basamakSayisi = 0;
        int n = 1, i;
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();

        sayiDeneme = sayi;
        while (sayiDeneme != 0) {
            basamakSayisi++;
            sayiDeneme /= 10;
        }

        sayiDeneme = sayi;
        while (sayiDeneme != 0) {
            System.out.println(sayiDeneme);
            for (i = 0; i < basamakSayisi; i++) {
                n *= sayiDeneme % 10;
                System.out.println("döngüde" + i + "  " + n);
            }
            sayiKontrol += n;
            n = 1;
            sayiDeneme /= 10;
        }

        if (sayiKontrol == sayi) {
            System.out.println("Armstrong sayıdır.");
        } else {
            System.out.println("Armstrong sayı değildir");
        }
    }
}