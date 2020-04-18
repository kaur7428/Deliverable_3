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
 * @author Japne
 */
public class HandTest {
    
    public HandTest() {
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
     * Test of addCard method, of class Hand.
     */
    @Test
    public void testAddCardGood() {
        System.out.println("addCard");
        UnoCard card = null;
        Hand instance = new Hand();
        boolean expResult = true;
        boolean result = instance.addCard(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testAddCardBad() {
        System.out.println("addCard");
        UnoCard card = null;
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.addCard(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
    }
     @Test
    public void testAddCardBoundary() {
        System.out.println("addCard");
        UnoCard card = null;
        Hand instance = new Hand();
        boolean expResult = false;
        boolean result = instance.addCard(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCard method, of class Hand.
     */
    @Test
    public void testGetCardBoundary() {
        System.out.println("getCard");
        int index = 0;
        Hand instance = new Hand();
        UnoCard expResult = null;
        UnoCard result = instance.getCard(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testGetCardGood() {
        System.out.println("getCard");
        int index = 0;
        Hand instance = new Hand();
        UnoCard expResult = null;
        UnoCard result = instance.getCard(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGetCardBad() {
        System.out.println("getCard");
        int index = 0;
        Hand instance = new Hand();
        UnoCard expResult = null;
        UnoCard result = instance.getCard(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testShowCardGood() {
        System.out.println("showCard");
        int index = 0;
        Hand instance = new Hand();
        String expResult = "true";
        String result = instance.showCard(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testShowCardBad() {
        System.out.println("showCard");
        int index = 0;
        Hand instance = new Hand();
        String expResult = "false";
        String result = instance.showCard(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testShowCardBoundary() {
        System.out.println("showCard");
        int index = 0;
        Hand instance = new Hand();
        String expResult = "false";
        String result = instance.showCard(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}