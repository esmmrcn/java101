public class BHarfiYazdirma {

    public static void main(String[] args) {
        String[][] arr = new String[7][4];

        for (int i = 0 ; i<arr.length ; i++) {
            for (int j=0;j < arr[0].length ; j++) {
                if (i % 3 == 0 || j%3 == 0 ) {
                    arr[i][j]=" * ";
                }else{
                    arr[i][j]="   ";
                }
            }
        }

        for (String[] row:arr) {
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
