import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int n;
        int ebob = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                ebob+=i;
            }
        }

        System.out.println(n+ ((ebob==n)? " Mükemmel sayıdır." :" Mükemmel sayı değildir."));
    }
}
