package Encapsulation;

public class EncPlayer {
    private String name;
    private int health = 100; // Default Value.
    private String weapon;

    public EncPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) this.health = health;
        this.weapon = weapon;
    }
    //    Methods:
    public void loseHealth (int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Oh dear, you are dead");
    //    Then --> Reduce number lof Lives.
        }
    }

//    Usando Getters, podemos refactor el CODE sin necesidad de cambiar otras classes.
    public int getHealth() {
        return health;
    }
}
