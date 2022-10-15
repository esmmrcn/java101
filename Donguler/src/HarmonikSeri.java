import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        double n,toplam=0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("n sayısını giriniz : ");
        n = input.nextInt();

        while(n!=0){
            toplam+=1/n;
            n--;
        }
        System.out.println(toplam);
    }
}