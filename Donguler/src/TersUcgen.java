import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        int sayi,n,y;

        Scanner inp = new Scanner(System.in);
        System.out.println("Basamak Sayısı :");
        sayi= inp.nextInt();
        n=sayi;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            y = 2 *(sayi-i) - 1;
            for (int l = 0; l < y; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
