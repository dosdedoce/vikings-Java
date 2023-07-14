package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    private String msg;
    public Saxon(int health, int strength) {
        super(health, strength);
    }
    public int receiveDamage(int damage) {
        this.health-=damage;
        if (this.health<=0){
            this.msg="A Saxon has died in combat";
        } else {
            this.msg= "A Saxon has received " + damage + " points of damage";
        }

        return this.health-=damage;
    }
    public String getMsg(){
        return this.msg;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int i) {
        this.health=i;
    }

    public int getStrength() {
        return this.strength;
    }
}
