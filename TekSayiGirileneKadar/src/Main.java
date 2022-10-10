import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, sum = 0;

        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Sayı giriniz :");
            n = input.nextInt();
            if (n % 4 == 0) {
                sum += n;
            }
        } while (n % 2 == 0);

        System.out.println("Çift ve 4'ün katları olan sayıların toplamı :" + sum);
    }
}