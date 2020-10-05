/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.tees.v8246953;

/**
 *
 * @author v8246953
 */
public class Cadet extends Soldier{

    public Cadet(Faction fac) {
        super(fac);
    }
    
    @Override
    public int getPoints(){
        int p;
        switch(this.faction){
            case GDI: p = 25;
            break;
            case NOD: p = 20;
            break;
            case SCRIN: p = 15;
            break;
            default: p = 0;
        }
        return p;
    }
    
    @Override
    public String kill(){
        return "A " + this.faction + " cadet bites the dust: +" + getPoints() + "pts. \n";
    }
    
}
