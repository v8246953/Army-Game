package uk.ac.tees.v8246953;

import org.junit.Test;
import static org.junit.Assert.*;

/** 
 * A set of test cases to check the output of the Major class.
 * Based on work created by Mark Truran.
 */
public class MajorTest
{
    
    /** 
     * A no-args constructor.
     */
    public MajorTest()
    {
    }

    /**
     * Testing the getPoints() method, of class Major.
     */
    @Test
    public void testGdiPoints()
    {   
        System.out.println("Testing correct points for GDI major");
        final Soldier s = new Major(Faction.GDI);
        final int expectedValue = 55;
        assertEquals(s.getPoints(), expectedValue);   
    }
    
    /**
     * Testing the getPoints() method, of class Major.
     */
    @Test
    public void testNodPoints()
    {   
        System.out.println("Testing correct points for NOD major");
        final Soldier s = new Major(Faction.NOD);
        final int expectedValue = 60;
        assertEquals(s.getPoints(), expectedValue);
    }
     
    /**
     * Testing the getPoints() method, of class Major.
     */
    @Test
    public void testScrinPoints()
    {    
        System.out.println("Testing correct points for SCRIN major");
        final Soldier s = new Major(Faction.SCRIN);
        final int expectedValue = 70;
        assertEquals(s.getPoints(), expectedValue);
    }
     
    /**
     * Test of kill method, of class Major.
     */
    @Test
    public void testGdiKill()
    {
        System.out.println("Testing correct message for GDI major");
        final Soldier s = new Major(Faction.GDI);
        final String expectedMessage = "A GDI major explodes into pieces: +55pts.\n";
        final String actualMessage = s.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class Major.
     */
    @Test
    public void testNodKill()
    {
        System.out.println("Testing correct message for NOD major");
        final Soldier s = new Major(Faction.NOD);
        final String expectedMessage = "A NOD major explodes into pieces: +60pts.\n";
        final String actualMessage = s.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class Major.
     */
    @Test
    public void testScrinKill()
    {
        System.out.println("Testing correct message for SCRIN major");
        final Soldier s = new Major(Faction.SCRIN);
        final String expectedMessage = "A SCRIN major explodes into pieces: +70pts.\n";
        final String actualMessage = s.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
   
}

