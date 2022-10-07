import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double  tutar, kdvliFiyat, kdvOranı;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        tutar =input.nextFloat();

        kdvOranı = (0<tutar && tutar<1000)? 0.18 : 0.08;
        kdvliFiyat = (0<tutar && tutar<1000)? (tutar*(1+kdvOranı)) : (tutar*(1+kdvOranı));

        System.out.println("KDV'siz Fiyat="+ tutar);
        System.out.println("KDV'li Fiyat="+ kdvliFiyat);
        System.out.println("KDV Tutarı="+ kdvOranı);



    }
}