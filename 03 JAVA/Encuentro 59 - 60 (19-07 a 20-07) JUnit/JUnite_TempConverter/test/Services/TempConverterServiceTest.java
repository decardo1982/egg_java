/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

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
public class TempConverterServiceTest {
    
    public TempConverterServiceTest() {
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
     * Test of TemperatureConverter method, of class TempConverterService.
     */
    @Test
    public void testTemperatureConverter() {
        System.out.println("TemperatureConverter");
        TempConverterService instance = new TempConverterService();
        double expResult = 0.0;
        double result = instance.TemperatureConverter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of celciusToF method, of class TempConverterService.
     */
    @Test
    public void testCelciusToF() {
        System.out.println("celciusToF");
        TempConverterService instance = new TempConverterService();
        double expResult = 0.0;
        double result = instance.celciusToF();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of celciusToK method, of class TempConverterService.
     */
    @Test
    public void testCelciusToK() {
        System.out.println("celciusToK");
        TempConverterService instance = new TempConverterService();
        double expResult = 0.0;
        double result = instance.celciusToK();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
