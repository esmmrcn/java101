public class MatriksTranspoz {
    public static int[][] transpose(int[][] arr) {
        int[][] t = new int[arr[0].length][arr.length];

        for(int i= 0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++)  {
                t[j][i]=arr[i][j];
            }
        }
        return t;
    }
    static String printArr(int[][] arr){
        String str="";
        for(int[] row: arr){
            for(int col: row) {
                str+=col+ "\t";
            }
            str+="\n";
        }
        return str;
    }
    public static void main(String[] args) {

        int[][] arr = {{2,3,4},{5,6,4}};

        System.out.print("Matrix :\n" + printArr(arr) +
                "Transpose : \n" + printArr(transpose(arr)));

    }
}
