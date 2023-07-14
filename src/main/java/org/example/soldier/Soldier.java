package org.example.soldier;

public class Soldier {
    public int health;
    public int strength;
    public Soldier(int health, int strength) {
        this.health=health;
        this.strength=strength;
    }

    public int attack() {
        return this.strength;
    }
    public int receiveDamage(int damage){
        return this.health-=damage;
    }

}
