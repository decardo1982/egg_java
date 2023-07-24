/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junite_tempconverter;

import Services.TempConverterService;
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
public class JUnite_TempConverterTest {
    
    public JUnite_TempConverterTest() {
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
     * Test of main method, of class JUnite_TempConverter.
     */
    @Test
    public void test1(){
        TempConverterService test1 = new TempConverterService();
        test1.TemperatureConverter();
        
    }
    
}
