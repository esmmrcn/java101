import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        arr[index] = Integer.MAX_VALUE;
        return min;
    }

    static String printArray(int[] arr){
        String str="";
        for (int i : arr){
            str+= i +" ";
        }
        return str;
    }

    public static void main(String[] args) {
        int n;
        int[] arr;
        int[] sortArray;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n = inp.nextInt();
        arr = new int[n];
        sortArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı : ");
            arr[i] = inp.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            sortArray[j] = minElement(arr);
        }

        System.out.println("Sıralama : " + printArray(sortArray));

    }
}

