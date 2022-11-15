public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge; //yana kaçma %

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge < 0 || dodge > 100)
            this.dodge = 0;
        else
            this.dodge = dodge;
    }

    void hit(Fighter foe) { //rakip

        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu !");
        if (isDodge())
            System.out.println(foe.name + " hasarı savurdu !");
        else
            foe.health -= this.damage;
    }

    boolean isDodge() {
        if (Math.random() * 100 <= this.dodge) {
            return true;
        } else {
            return false;
        }
    }

    void print() {
        System.out.println(this.name + " sağlık :" + this.health);
    }
}
