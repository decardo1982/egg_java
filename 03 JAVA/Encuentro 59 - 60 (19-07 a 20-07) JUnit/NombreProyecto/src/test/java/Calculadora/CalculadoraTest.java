/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import tutoria.nombreproyecto.Calculadora;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CalculadoraTest {
    
    
    public CalculadoraTest() {
    }
    
    static Calculadora calculadora;
    
    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream outputCaptor = new ByteArrayOutputStream();
    
    @BeforeClass
    public static void setUpClass() {
        calculadora = new Calculadora();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputCaptor));
    }
    
    @After
    public void tearDown() {
        System.setOut(originalSystemOut);
        calculadora.limpiarAcumulador();
        calculadora.limpiarResultado();
    }
    
       @Test
    public void testMensajeAcumuladorLimpio(){
        calculadora.limpiarAcumulador();
        assertEquals("Acumulador Limpio", outputCaptor.toString().trim());
        
    }
    
    @Test
    public void testSumar() {
        calculadora.sumar(2, 3);
        assertEquals(5, calculadora.getResultado(), 0);
    }
    
    @Test
    public void testSumaDosYCero()
    {
        calculadora.sumar(2, 0);
        assertEquals(2, calculadora.getResultado(), 0);
    }

    @Test
    public void testRestar() {
        calculadora.restar(5, 3);
        assertEquals(2, calculadora.getResultado(), 0);
    }

    @Test
    public void testMultiplicar() {
        calculadora.multiplicar(4, 3);
        assertEquals(12, calculadora.getResultado(), 0);
    }

    @Test
    public void testDividir(){
         // Caso de prueba: División válida
        calculadora.dividir(10.0, 2.0);
        assertEquals(5.0, calculadora.getResultado(), 0.001); // Comprobamos si el resultado es 5.0

        // Caso de prueba: Otra división válida
        calculadora.dividir(8.0, 4.0);
        assertEquals(2.0, calculadora.getResultado(), 0.001);
    }
    
    @Test @Ignore
    public void testDividirPorCero(){
        // Caso de prueba: Intento de división por cero
        calculadora.dividir(5.0, 0.0);
        assertEquals(0, calculadora.getResultado(), 0.001);
    }

    @Test
    public void testConsultarAcumulador() {
        calculadora.sumar(2, 3); // 5
        calculadora.restar(5, 3); // 2
        // Acumulador = 5 + 2 + 5;
        assertEquals(7.0, calculadora.consultarAcumulador(),0);
    }
    

    
}
