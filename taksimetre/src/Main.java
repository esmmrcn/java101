import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, acilisUcreti=10;
        double tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen km değerini giriniz: ");

        km = input.nextInt();
        tutar=acilisUcreti+2.2*km;
        tutar = (tutar<20)? 20 : tutar;

        System.out.println("Tutar:"+tutar);
    }

}