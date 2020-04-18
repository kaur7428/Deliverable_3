/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author japne
 */
public class WildCardTest {
    
    public WildCardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getColor method, of class WildCard.
     */
    @Test
    public void testGetColorGood() {
        System.out.println("getColor");
        WildCard instance = new WildCardImpl();
        String expResult = "True";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     
     @Test
    public void testGetColorBad() {
        System.out.println("getColor");
        WildCard instance = new WildCardImpl();
        String expResult = "False";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getValue method, of class WildCard.
     */
    @Test
    public void testGetValueBoundary() {
        System.out.println("getValue");
        WildCard instance = new WildCardImpl();
        String expResult = "False";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of applyEffect method, of class WildCard.
     */
   
   
    @Test
    public void testSetColorGood() {
        System.out.println("setColor");
        String color = "";
        WildCard instance = new WildCardImpl();
        boolean expResult = true;
        boolean result = instance.setColor(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testSetColorBad() {
        System.out.println("setColor");
        String color = "";
        WildCard instance = new WildCardImpl();
        boolean expResult = false;
        boolean result = instance.setColor(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testSetColorBoundary() {
        System.out.println("setColor");
        String color = "";
        WildCard instance = new WildCardImpl();
        boolean expResult = false;
        boolean result = instance.setColor(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class WildCard.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toString");
        WildCard instance = new WildCardImpl();
        String expResult = "true";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
@Test
    public void testToStringBad() {
        System.out.println("toString");
        WildCard instance = new WildCardImpl();
        String expResult = "false";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testToStringBoundary() {
        System.out.println("toString");
        WildCard instance = new WildCardImpl();
        String expResult = "false";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public class WildCardImpl extends WildCard {
    }
    
}
