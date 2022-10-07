import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5.0;

        System.out.print("Armut kaç kilo ? :");
        Scanner input = new Scanner(System.in);
        armut*= input.nextDouble();

        System.out.print("Elma kaç kilo ? :");
        Scanner input1 = new Scanner(System.in);
        elma*= input.nextDouble();

        System.out.print("Domates kaç kilo ? :");
        Scanner input2 = new Scanner(System.in);
        domates*= input.nextDouble();

        System.out.print("Muz kaç kilo ? :");
        Scanner input3 = new Scanner(System.in);
        muz*= input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? :");
        Scanner input4 = new Scanner(System.in);
        patlıcan*= input.nextDouble();

        System.out.println("Toplam tutar : "+(armut+elma+domates+muz+patlıcan)+" TL");
    }
}