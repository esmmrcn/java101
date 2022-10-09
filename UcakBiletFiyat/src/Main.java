import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double ucret, indirimOrani = 0.0;


        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön , 2=> Gidiş Dönüş) : ");
        yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas > 0) {
            if (yas < 12) {
                indirimOrani = 0.5;
            } else if (yas < 24) {
                indirimOrani = 0.1;
            } else if (yas > 65) {
                indirimOrani = 0.3;
            } else {
                indirimOrani = 0;
            }

            ucret = mesafe * 0.1;
            ucret *= (1 - indirimOrani);

            switch (yolculukTipi) {
                case 1:
                    ucret *= (1 - indirimOrani);
                    break;
                case 2:
                    indirimOrani = 0.2;
                    ucret *= 2*(1 - indirimOrani);
                    break;
                default:
                    System.out.println("Hatalı Veri Girdiniz !");
            }
            System.out.println("Toplam Tutar = " +ucret +" TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }

}
