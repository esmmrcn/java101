import java.util.Arrays;

public class TekrarEdenCiftSayilar {

    static boolean isExist(int[] arr, int n) {
        for (int i : arr) {
            if (i == n)
                return true;
        }
        return false;
    }

    static String printArr(int[] arr){
        String str="";
        for(int i :arr){
            if(i!=0)
               str+= i + " ";
        }
        return str;
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 2, 2, 9, 10, 21, 4, 33, 10, 4};

        int[] repeat = new int[arr.length];
        int index = 0;
        boolean exist = false;


        for (int i = 0; i < arr.length; i++) {
            if (!isExist(repeat, arr[i]) && arr[i] % 2 == 0){
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        repeat[index] = arr[i];
                        index++;
                        break;
                    }
                }
            }
        }



        System.out.println("Dizi : " +Arrays.toString(arr) +
                "\nDizideki tekrar eden çift sayılar : " + printArr(repeat));
    }
}
