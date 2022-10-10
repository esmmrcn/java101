import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i, sayi, sum=0, avg, n=0;


        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : " );
        sayi = inp.nextInt();

        for (i=0; i<=sayi; i+=12){
            sum+=i;
            n++;
        }
    avg=sum/n;
        System.out.print("3'e ve 4'e tam bölünen sayıların ortalaması: "+avg);
    }
}