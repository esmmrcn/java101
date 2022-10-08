import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz:");
        sicaklik= input.nextInt();

        if (sicaklik <= 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sicaklik <= 10){
            System.out.println("Sinemeya gidebilirsiniz.");
        }else if (sicaklik <= 15){
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
        }else if (sicaklik <= 25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}