/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dario
 */
public class UnidadesTest {
    
    public UnidadesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCelcius method, of class Unidades.
     */
    @Test
    public void testGetCelcius() {
        System.out.println("getCelcius");
        Unidades instance = new Unidades();
        double expResult = 0.0;
        double result = instance.getCelcius();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCelcius method, of class Unidades.
     */
    @Test
    public void testSetCelcius() {
        System.out.println("setCelcius");
        double celcius = 0.0;
        Unidades instance = new Unidades();
        instance.setCelcius(celcius);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKelvin method, of class Unidades.
     */
    @Test
    public void testGetKelvin() {
        System.out.println("getKelvin");
        Unidades instance = new Unidades();
        double expResult = 0.0;
        double result = instance.getKelvin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKelvin method, of class Unidades.
     */
    @Test
    public void testSetKelvin() {
        System.out.println("setKelvin");
        double kelvin = 0.0;
        Unidades instance = new Unidades();
        instance.setKelvin(kelvin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFahrenheit method, of class Unidades.
     */
    @Test
    public void testGetFahrenheit() {
        System.out.println("getFahrenheit");
        Unidades instance = new Unidades();
        double expResult = 0.0;
        double result = instance.getFahrenheit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFahrenheit method, of class Unidades.
     */
    @Test
    public void testSetFahrenheit() {
        System.out.println("setFahrenheit");
        double fahrenheit = 0.0;
        Unidades instance = new Unidades();
        instance.setFahrenheit(fahrenheit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
