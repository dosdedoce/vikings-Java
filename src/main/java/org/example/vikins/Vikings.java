package org.example.vikins;
import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name;
    private String msg;
    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name=name;
    }
    public int receiveDamage(int damage){
        if(this.health-damage<=0){
            this.msg=this.name + "has died in combat";
        } else {
            this.msg=this.name + "has received" + damage + "points of damage";
        }
        return this.health-=damage;
    }
    public String getMsg(){
        return this.msg;
    }
    public String battleCry(){
        String s = "Odin Owns You All!";
        return s;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int i) {
        this.health=i;
    }

    public String getName() {
        return this.name;
    }
}
