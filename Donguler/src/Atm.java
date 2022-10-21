import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        String kullaniciAdi, parola;
        int islem = 0;
        int bakiye = 1500;
        int paraMiktari = 0;
        int hak = 3;

        Scanner input = new Scanner(System.in);

        while (hak >= 0){
            System.out.println("Kullanıcı Adınız :");
            kullaniciAdi = input.nextLine();

            System.out.println("Parolanız :");
            parola = input.nextLine();

            if (kullaniciAdi.equals("patika") && parola.equals("123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz ! ");
                do {

                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.\n" +
                            "1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış yap");
                    islem = input.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.print("Para Miktarı:");
                            paraMiktari = input.nextInt();
                            bakiye += paraMiktari;
                            break;
                        case 2:
                            System.out.print("Para Miktarı:");
                            paraMiktari = input.nextInt();
                            if (paraMiktari > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= paraMiktari;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + bakiye);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                    }
                } while (islem != 4);

            } else {
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    break;
                } else {
                    System.out.println("Yanlış kullanıcı adı veya şifre. Lütfen tekrar deneyiniz. Kalan hakkınız :" + --hak);
                }
            }
        }

    }
}