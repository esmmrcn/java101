import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5.0;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Armut kaç kilo ? :");
        armut*= input.nextDouble();

        System.out.print("Elma kaç kilo ? :");
        elma*= input.nextDouble();

        System.out.print("Domates kaç kilo ? :");
        domates*= input.nextDouble();

        System.out.print("Muz kaç kilo ? :");
        muz*= input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? :");
        patlıcan*= input.nextDouble();

        System.out.println("Toplam tutar : "+(armut+elma+domates+muz+patlıcan)+" TL");
    }
}
