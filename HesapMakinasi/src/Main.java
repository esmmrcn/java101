
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n1, n2, islem;
        double sonuc=0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("ilk sayıyı giriniz:");
        n1 = input.nextInt();

        System.out.print("2. sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("Yapacağınız işlem numarasını giriniz:\n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                sonuc=n1+n2;
                break;
            case 2:
                sonuc=n1-n2;
                break;
            case 3:
                sonuc=n1*n2;
                break;
            case 4:
                if(n2!=0){
                    sonuc=n1/n2;
                }else {
                    System.out.println("Bir sayı sıfıra bölünemez.");
                }
                break;
            default:
                System.out.println("İşlem numarsını yanlış girdiniz, tekrar deneyiniz.");
        }
        System.out.println(sonuc);
     }
}
