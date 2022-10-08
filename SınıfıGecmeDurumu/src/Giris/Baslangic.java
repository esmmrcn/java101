package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik, dersSayisi=5;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat =input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik =input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya =input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce =input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik =input.nextInt();

        if(0<mat && mat>100) {
            mat = 0;
            dersSayisi--;
        }
        if(0<fizik && fizik>100) {
            fizik = 0;
            dersSayisi--;
        }
        if(0<kimya && kimya>100) {
            kimya = 0;
            dersSayisi--;
        }
        if(0<turkce && turkce>100) {
            turkce = 0;
            dersSayisi--;
        }
        if(0<muzik && muzik>100) {
            muzik = 0;
            dersSayisi--;
        }

        float toplam = (mat+fizik+kimya+turkce+muzik);
        float ortalama = (toplam/dersSayisi);

        if(ortalama >= 55){
            System.out.println("Ortalama:\t"+ortalama+"\nSonuç: Sınıfı Geçti");
        }else {
            System.out.println("Ortalama:\t"+ortalama+"\nSonuç: Sınıfta kaldı");
        }


    }
}
