package Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

//    Methods:
    public void loseHealth (int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Oh dear, you are dead");
//            Then --> Reduce number lof Lives.
        }
    }
    public int healthRemaining (){
        return this.health;
    }

}
