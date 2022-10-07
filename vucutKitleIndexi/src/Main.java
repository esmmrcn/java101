import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, vucutKitleIndeksi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        Scanner input = new Scanner(System.in);
        boy= input.nextDouble();

        System.out.print("Lütfen kilonuzu (kg cinsinde) giriniz: ");
        Scanner input1 = new Scanner(System.in);
        kilo= input.nextDouble();

        vucutKitleIndeksi=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz:"+vucutKitleIndeksi);

    }
}