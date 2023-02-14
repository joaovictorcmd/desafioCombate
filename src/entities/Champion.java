package entities;

public class Champion {

    public String name;
    public int life;
    public int attack;
    public int armor;

    public Champion() {
    }

    public String getName() {
        return name;
    }

    public Champion(String name, int life, int damage, int armor) {
        this.name = name;
        this.life = life;
        this.attack = damage;
        this.armor = armor;
    }

    public void takeDamage(Champion other) {

        if (this.armor > other.attack) {
            this.life--;
        } else {
            this.life -= (other.attack - this.armor);
        }
    }

    public String status() {

        if (this.life <= 0) {
            return "0 de vida (morreu)";
        } else {
            return life + " de vida";
        }

    }

}
