import java.util.Scanner;

public class YildizlarlaElmas {
    public static void main(String[] args) {

        int n , i = 0, j, k = 0, x, y, l;

        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        for (n = sayi; n > i; n--) {

            for (j = 1; j < n; j++) {
                System.out.print(" ");
            }
            x = 2 * (sayi - n) + 1;
            for (k = 0; k < x; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        n=sayi;
        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            y = 2 *(sayi-i) - 1;
            for (l = 0; l < y; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}