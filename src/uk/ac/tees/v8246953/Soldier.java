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
public abstract class Soldier implements Killable{
    
    private Faction faction = Faction.NOD;
    
    public Soldier(String fac){
        Faction faction = Faction.valueOf(fac);
    }
    
    public int getPoints(){
        return 0;
    }
}
