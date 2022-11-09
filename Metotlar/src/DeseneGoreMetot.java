import java.util.Scanner;

public class DeseneGoreMetot {
    static int i=0,j=0;
    static void metot(int n){

        System.out.print(n+" ");

        if(i==j && i!=0)
            return;

        if(n>0 && j==0){
            i++;
            metot(n-5);
        }else{
            j++;
            metot(n+5);
        }
    }

    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        n= inp.nextInt();

        System.out.print("Sonuç : ");
        metot(n);

    }
}
