import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]){

        double kenar1, kenar2, kenar3, cevre, alan, u;

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenarını giriniz: ");
        kenar1 = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Üçgenin 2. kenarını giriniz: ");
        kenar2 = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Üçgenin 3. kenarını giriniz: ");
        kenar3 = input.nextDouble();

        cevre=(kenar1+kenar2+kenar3);
        u=cevre/2;
        alan= Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Çevre: "+cevre);
        System.out.println("Alan: "+alan);
    }
}

