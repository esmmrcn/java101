import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        String zodyak="";

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz : ");
        yil = input.nextInt();

        switch (yil%12) {
            case 0:
                zodyak = "Maymun";
                break;
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Kaplan";
                break;
            case 7:
                zodyak = "Tavşan";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yılan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;
            default:
                System.out.println("error");
        }
        System.out.println("Çin Zodyağı Burcunuz : "+zodyak);
    }
}