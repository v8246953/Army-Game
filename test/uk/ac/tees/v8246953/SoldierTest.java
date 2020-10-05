package uk.ac.tees.v8246953;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/** 
 * A set of test cases to check the output of the Soldier abstract class.
 * Based on work created by Mark Truran.
 */
public class SoldierTest
{

    /**
     * Testing global points counter in Soldier.
     */
    @Test
    public void testCounter()
    {

        System.out.println("Testing global counter in Soldier");
        final ArrayList<Killable> al = new ArrayList<Killable>();
        al.add(new Cadet(Faction.NOD));
        al.add(new Major(Faction.SCRIN));
        al.add(new Colonel(Faction.GDI));
        al.add(new Cadet(Faction.GDI));
        al.add(new Major(Faction.NOD));
        al.add(new Colonel(Faction.SCRIN));
        
        for (Killable k : al)
        {
            k.kill();
        }
        final int expectedTotalSoldierPoints = 365;
        assertEquals(Soldier.totalPoints, expectedTotalSoldierPoints);
    }
}
