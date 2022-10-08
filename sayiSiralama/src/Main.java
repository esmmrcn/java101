import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c;

        System.out.print("Ilk sayiyi giriniz(a) :");
        a = keyboard.nextInt();
        System.out.print("Ikinci sayiyi giriniz(b) :");
        b = keyboard.nextInt();
        System.out.print("Ucuncu sayiyi giriniz(c) :");
        c = keyboard.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        }else if (b<a && b<c){
            if (a<c){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }
        }else {
            if (a<b){
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }
    }
}
