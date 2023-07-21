/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of main method, of class Calculadora.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Calculadora.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testAdd(){
        System.out.println("Prueba de suma");
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println(result);
        assertEquals(5, result);
    }
    
    @Test
    public void testSubstract(){
        System.out.println("prueba de resta");
        Calculator calculator = new Calculator();
        int result = calculator.substract(5, 3);
        System.out.println(result);
        assertEquals(2, result);
    }
    
    @Test
    public void testMultiply(){
        System.out.println("Mutiply test");
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 3);
        System.out.println(result);
        assertEquals(15, result);
    }
    
    @Test
    public void testDivide(){
        System.out.println("Test Divide");
        Calculator calculator = new Calculator();
        int result = (int) calculator.divide(15, 3);
        System.out.println(result);
        assertEquals(5, result);
    }
    
}
