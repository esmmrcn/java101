public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Yakup", 25, 120, 100, 30);
        Fighter f2 = new Fighter("Yusuf", 40, 85, 41, 40);

        Ring r1 = new Ring(f1, f2, 40, 100);

        r1.print();

    }
}