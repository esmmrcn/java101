import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        int n,k,i,result=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı :");
        n= input.nextInt();
        System.out.print("Üst olacak sayı :");
        k= input.nextInt();

        for(i=0;i<k;i++){
            result*=n;
        }

        System.out.println(n+"^"+k+" = "+result);
    }
}