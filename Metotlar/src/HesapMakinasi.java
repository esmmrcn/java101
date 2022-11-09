import java.util.Scanner;

public class HesapMakinasi {

    static void plus(int a, int b) {
        System.out.print(a + b);
    }

    static void minus(int a, int b) {
        System.out.print(a - b);
    }

    static void times(int a, int b) {
        System.out.print(a * b);
    }

    static void divided(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayı 0'a bölünemez");
        } else {
            System.out.print(a / b);
        }
    }

    static void power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.print(result);
    }

    static void factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.print(result);
    }

    static void mod(int a, int b) {
        System.out.print(a % b);
    }

    static void dikdortgen(int a, int b) {
        System.out.print("Alan :" + a * b+
                "\nÇevre :" + 2 * a * b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select,a=0,b=0;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();

            if(select==6){
                System.out.println("Sayı giriniz :");
                a= scan.nextInt();
            }else if(select!=0){
                System.out.print("İlk değeri giriniz giriniz :");
                a= scan.nextInt();
                System.out.print("2. değeri giriniz giriniz :");
                b= scan.nextInt();
            }
            System.out.println("Sonuç :");
            switch (select) {
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    dikdortgen(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }
}