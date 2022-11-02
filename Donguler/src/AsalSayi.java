public class AsalSayi {
    public static void main(String[] args) {

        boolean asalSayi;
        int n, i;
        for (n = 1; n <= 100; n++) {
            asalSayi = (n == 2) ? true : false;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    asalSayi = false;
                    break;
                } else {
                    asalSayi = true;
                }
            }
            if (asalSayi) {
                System.out.print(n + " ");
            }
        }
    }
}
