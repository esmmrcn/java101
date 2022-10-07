import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int r;
        double cevre, dilimAlani, pi=3.14, aci;

        System.out.print("Dairenin yarıçapını giriniz: ");
        Scanner input = new Scanner(System.in);
        r= input.nextInt();

        System.out.print("Merkez açı ölçüsünü giriniz: ");
        Scanner input1 = new Scanner(System.in);
        aci= input1.nextInt();

        dilimAlani= (pi*r*r)*aci/360;

        System.out.print("Daire diliminin alanı:"+dilimAlani);

    }

}