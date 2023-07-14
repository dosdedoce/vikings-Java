package org.example.war;
import org.example.saxon.Saxon;
import org.example.vikins.Vikings;
import java.util.ArrayList;
import java.util.List;

public class War {
    public List<Vikings> listV;
    public List<Saxon> listS;
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
    public String vikingAttack() {
        int randomSaxonIndex =(int) Math.floor(Math.random() * this.listS.size());
        Saxon randomSaxon = this.listS.get(randomSaxonIndex);

        int randomVikingIndex = (int) Math.floor(Math.random() * this.listV.size());
        Vikings randomViking = this.listV.get(randomVikingIndex);

        String result = randomViking.receiveDamage(randomSaxon.attack());

        if (randomSaxon.getHealth() <= 0) {
            this.listS.remove(randomSaxonIndex);
        }
        return result;
    }
}
