import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i, j, number;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        number = input.nextInt();

        System.out.println("4 ve 5 in kuvvetleri:");
        for (i=1,j=1; i<=number; i*=4, j*=5){
            if (j<=number){
                System.out.println(i+"\t\t"+j);
            }else{
                System.out.println(i);
            }
        }
    }
}