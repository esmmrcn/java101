public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheck() {
        if (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
            return true;
        else
            return false;
    }

    String winner(Fighter f1, Fighter f2) {
        if (f1.health <= 0)
            return f2.name;
        else
            return f1.name;

    }

    void print() {
        if (isCheck()) {
            System.out.println("Dövüş Başlasın !");
            int i = 1;
            while (true) {
                System.out.println("============ " + i +
                        ". ROUND ============");
                if (f1.health > 0 && f2.health > 0) {
                    f1.print();
                    f2.print();

                    if (Math.random() < 0.5)
                        f1.hit(f2);
                    else
                        f2.hit(f1);

                } else {
                    System.out.println("Kazanan : " + winner(f1, f2) + "!");
                    break;
                }
                i++;
            }
        } else {
            System.out.println("Dövüşcülerin kiloları boks için uygun değil.");
        }
    }
}
