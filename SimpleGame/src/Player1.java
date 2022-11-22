import java.awt.*;

class  Player1{
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public void damageByGun(){
            this.health -= 30;
            if (this.health <= 0){
                this.health=0;

            }
        System.out.println("HIT  by Gun");
            if (this.health == 0) {
                System.out.println(this.name + " Is Dead !!");
            }

    }

    public static void main(String[] args) {
        Player1 player1 = new Player1("Sanjay","Knife",100);
        player1.damageByGun();
    }

}