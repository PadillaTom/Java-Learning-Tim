package Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Restrict access to certain components, in the Objects we are creating.
//        "Hide" Inner Working of a class.


//        PLAYER NO ENCAPSULATION: He can change HEALTH, etc...
//        Player player1 = new Player();
//        player1.name = "Tom";
//        player1.health = 20;
//        player1.weapon = "Sword";//
//        int damage = 10;
//        player1.loseHealth(damage);
//        System.out.println("Remaining Health = " + player1.healthRemaining());
//        damage = 11;
//        player1.loseHealth(damage);
//        System.out.println("Remaining Health = " + player1.healthRemaining());

//        ENCAPSULATED PLAYER:
        EncPlayer player2 = new EncPlayer("Tim", 500,"Sword");
        System.out.println("Initial Health= " + player2.getHealth());

    }
}
