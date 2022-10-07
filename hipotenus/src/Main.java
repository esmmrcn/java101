import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]){

        double kenar1, kenar2, hipotenus, cevre, alan, u;

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1. dik kenarını giriniz: ");
        kenar1 = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Üçgenin 2. dik kenarını giriniz: ");
        kenar2 = input.nextDouble();

        hipotenus= Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
        cevre=(kenar1+kenar2+hipotenus);
        u=cevre/2;
        alan= Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-hipotenus));

        System.out.println("Hipotenüs: "+hipotenus);
        System.out.println("Çevre: "+cevre);
        System.out.println("Alan: "+alan);
    }
}
