import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int n=0;
        int number, min=0, max=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        n= input.nextInt();

        for (int i=1; i<n+1; i++){
            System.out.println(i+". Sayıyı giriniz: ");
            number = input.nextInt();

            if (i==1){
                min=number;
                max=number;
            }

            if(number<min){
                min=number;
            }else {
                max=number;
            }
        }

        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);

    }
}
