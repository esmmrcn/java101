import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        String burc="";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay sayısını giriniz:");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün sayısını giriniz:");
        day = input.nextInt();

        if (month == 1 && 0 < day && day < 32) {
            burc = (day < 22) ? "Oğlak" : "Kova";
        }else if (month == 2 && 0 < day && day < 29) {
            burc = (day < 20) ? "Kova" : "Balık";
        }else if (month == 3 && 0 < day && day < 32) {
            burc = (day < 21) ? "Balık" : "Koç";
        }else if (month == 4 && 0 < day && day < 31) {
            burc = (day < 21) ? "Koç" : "Boğa";
        }else if (month == 5 && 0 < day && day < 32) {
            burc = (day < 22) ? "Boğa" : "İkizler";
        }else if (month == 6 && 0 < day && day < 31) {
            burc = (day < 23) ? "İkizler" : "Yengeç";
        }else if (month == 7 && 0 < day && day < 32) {
            burc = (day < 23) ? "Yengeç" : "Aslan";
        }else if (month == 8 && 0 < day && day < 31) {
            burc = (day < 23) ? "Aslan" : "Başak";
        }else if (month == 9 && 0 < day && day < 32) {
            burc = (day < 23) ? "Başak" : "Terazi";
        }else if (month == 10 && 0 < day && day < 31) {
            burc = (day < 23) ? "Terazi" : "Akrep";
        }else if (month == 11 && 0 < day && day < 32) {
            burc = (day < 22) ? "Akrep" : "Yay";
        }else if (month == 12 && 0 < day && day < 31) {
            burc = (day < 22) ? "Yay" : "Oğlak";
        } else {
            System.out.println("Hatalı değer girdiniz. Lütfen tekrar deneyiniz.");
        }
        System.out.println("Burcunuz:"+burc);
    }
}