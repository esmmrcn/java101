public class HarmonikOrtalama {
    public static void main(String[] args) {

        double harmonicSum=0;
        double harmonicMean;

        int[] arr = {1,2,3,4,5};

        for (double i: arr) {
            harmonicSum+=1/i;
        }

        harmonicMean = arr.length/harmonicSum;
        System.out.println("Harmonik ortalama : " + harmonicMean);

    }
}
