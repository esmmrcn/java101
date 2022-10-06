package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat =input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik =input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya =input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce =input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih =input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik =input.nextInt();

        float toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        float ortalama = (toplam/6);

        String sonuc = (ortalama > 60)? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalama:\t"+ortalama+"\nSonuç:\t"+sonuc);
    }
}
