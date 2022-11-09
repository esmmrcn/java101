public class PalindromSayi {
    static boolean isPalindrom(int n) {
        int temp = n, inverseNumber = 0;
        while (temp % 10 != 0) {
            inverseNumber = inverseNumber * 10 + temp % 10;
            temp = temp / 10;
        }

        if (n == inverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        
        System.out.println(isPalindrom(12321));

    }
}
