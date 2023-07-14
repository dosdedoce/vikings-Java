package org.example.war;
import org.example.saxon.Saxon;
import org.example.vikins.Vikings;
import java.util.ArrayList;
import java.util.List;

public class War {
    public List<Vikings> listV;
    public List<Saxon> listS;
    private String msg;
    public War() {
       this.listV = new ArrayList<Vikings>();
       this.listS = new ArrayList<Saxon>();
    }

    public List<Vikings> getVikingArmy() {
        return listV;
    }
    public List<Saxon> getSaxonArmy() {
        return listS;
    }
    public List<Vikings> addViking(Vikings viking){
        this.listV.add(viking);
        return this.listV;
    }
    public List<Saxon> addSaxon(Saxon saxon){
        this.listS.add(saxon);
        return this.listS;
    }
    public int vikingAttack() {

        int randomSaxonIndex =(int) Math.floor(Math.random() * this.listS.size());
        Saxon randomSaxon = this.listS.get(randomSaxonIndex);

        int randomVikingIndex = (int) Math.floor(Math.random() * this.listV.size());
        Vikings randomViking = this.listV.get(randomVikingIndex);

        int result = randomSaxon.receiveDamage(randomViking.attack());

        if (randomSaxon.getHealth() <= 0) {
            this.listS.remove(randomSaxonIndex);
            this.msg="A Saxon has died in combat";
        }
        return result;
       // return this.msg;
    }

    public String saxonAttack() {

        int randomSaxonIndex =(int) Math.floor(Math.random() * this.listS.size());
        Saxon randomSaxon = this.listS.get(randomSaxonIndex);

        int randomVikingIndex = (int) Math.floor(Math.random() * this.listV.size());
        Vikings randomViking = this.listV.get(randomVikingIndex);

        int result = randomViking.receiveDamage(randomSaxon.attack());

        if (randomViking.getHealth() <= 0) {
            this.msg= listV.get(randomVikingIndex).getName() + "has died in act of combat";
            this.listV.remove(randomVikingIndex);
//            this.msg="A Saxon has died in combat";
        } else {
        //if(randomViking.getHealth()>0){
            this.msg=listV.get(randomVikingIndex).getName() + "has received" + listS.get(randomSaxonIndex).getStrength() + "points of damage";
        }
//           return result;
        return this.msg;
    }
}
