import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {

    static String printArray(int[] arr) {
        String str = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                str += arr[i];
            else
                str += arr[i] + ",";
        }
        str+="}";
        return str;
    }

    static void nearestNumbers(int[] arr, int n) {

        int before = Integer.MAX_VALUE;
        int after = Integer.MAX_VALUE;
        int distance1 = Integer.MAX_VALUE;
        int distance2 = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i == n) {
                before = i;
                after = i;
                break;
            } else if (i < n) {
                if (n - i < distance1) {
                    before = i;
                    distance1 = n - i;
                }
            } else {
                if (i - n < distance2) {
                    after = i;
                    distance2 = i - n;
                }
            }
        }
        System.out.println("Dizi : " + printArray(arr) +
                "\nGirilen Sayı : " + n +
                "\nGirilen sayıdan küçük en yakın sayı : " + before +
                "\nGirilen sayıdan büyük en yakın sayı : " + after);
    }
    
    public static void main(String[] args) {

        int arr[] = {15, 12, 788, 1, -1, -778, 2, 0};
        int n;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        n = inp.nextInt();

        nearestNumbers(arr, n);
    }
}