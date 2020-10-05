package uk.ac.tees.v8246953;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/** 
 * A set of test cases to check the output of the Vehicle class.
 * Based on work created by Mark Truran.
 */
public class VehicleTest
{

    /**
     * Testing global points counter in Vehicle.
     */
    @Test
    public void testCounter()
    {

        System.out.println("Testing global counter in Vehicle");
        final ArrayList<Killable> al = new ArrayList<Killable>();
        al.add(new LightTank(Faction.NOD));
        al.add(new HeavyTank(Faction.SCRIN));
        al.add(new LightTank(Faction.GDI));
        al.add(new HeavyTank(Faction.GDI));
        al.add(new LightTank(Faction.SCRIN));

        for (Killable k : al)
        {
            k.kill();
        }
        final int expectedTotalVehiclePoints = 970;
        assertEquals(Vehicle.totalPoints, expectedTotalVehiclePoints);
    }
}