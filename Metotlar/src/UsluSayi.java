import java.util.Scanner;

public class UsluSayi {
    static double power(int a, int b) {
        if (b > 0) {
            return a * power(a, b - 1);
        } else if (b < 0) {
            return power(a, b + 1) / a;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değerini giriniz :");
        a = inp.nextInt();
        System.out.print("Üs değerini giriniz :");
        b = inp.nextInt();
        inp.close();

        System.out.println(power(a, b));



    }
}
