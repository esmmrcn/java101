import java.util.Arrays;

public class ElemanlarinFrekansi {

    static boolean isExist(int[] arr, int n) {
        for (int i : arr) {
            if (i == n)
                return true;
        }
        return false;
    }

    static int howMany(int[] arr, int n) {
        int count = 0;
        for (int i : arr) {
            if (i == n)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int count = 1;

        int[] repeat = new int[arr.length];
        int index = 0;

        System.out.println("Dizi : " + Arrays.toString(arr) +
                "\nTekrar sayıları");

        for (int i = 0; i < arr.length; i++) {
            if (!isExist(repeat, arr[i]))
                System.out.println(arr[i] + " sayısı " + howMany(arr, arr[i]) + " kere tekrar edildi.");

            repeat[index] = arr[i];
            index++;
        }

    }
}
