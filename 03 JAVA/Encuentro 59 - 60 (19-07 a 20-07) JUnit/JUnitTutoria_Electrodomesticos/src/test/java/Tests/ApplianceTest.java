
package Tests;

import java.io.ByteArrayInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tutoria.junittutoria_electrodomesticos.Appliance;

public class ApplianceTest {
    
    public ApplianceTest() {
    }
    
    static Appliance ap;
    
    @BeforeClass // Lo que se hace antes, una sola vez general para TODOS los tests
    public static void setUpClass() {
        ap = new Appliance();        
    }
    
    @AfterClass // Lo que se hace al final, luego de la ejecucion de TODOS los tests
    public static void tearDownClass() {
    }
    
    @Before // Se ejecuta antes de CADA test
    public void setUp() {
        
    }
    
    @After // Se ejecuta luego de CADA test
    public void tearDown() {
    }
    
    
    
    @Test
    public void createApplianceTest(){
        
        //Ejecución del Test
        String input = "red\nA\n100\n"; //Creamos un string que contiene las entradas para el Scanner
        System.setIn(new ByteArrayInputStream(input.getBytes())); 
        ap.createAppliance();
        System.out.println(ap);
 
        //Verificación de resultados
        assertEquals(1000.0, ap.getPrice(),0);
        assertEquals("RED", ap.getColor());
        assertEquals('A', ap.getPowerConsumption());
        assertEquals(100, ap.getWeight());
        
    }
    
    @Test
    public void testCheckPowerConsumption(){
        Appliance ap = new Appliance();
        String input = "F";
        char result = ap.checkPowerConsumption(input.charAt(0));

        assertEquals('F', result);

        assertNotEquals('L', result);
    }
    
 @Test
    public void testFinalPrice(){
        Appliance appliance = new Appliance();
        appliance.setPowerConsumption('A');
        appliance.finalPrice();
        double price = appliance.getPrice();
        
        assertEquals(1000.0, price, 0);
        assertNotEquals(2000.0, price, 0);

        appliance = new Appliance();
        appliance.setPowerConsumption('B');
        appliance.finalPrice();
        price = appliance.getPrice();

        assertEquals(800.0, price, 0);
        assertNotEquals(2000.0, price, 0);

        appliance = new Appliance();
        appliance.setPowerConsumption('C');
        appliance.finalPrice();
        price = appliance.getPrice();
        assertEquals(600.0, price, 0);
        assertNotEquals(2000.0, price, 0);

        appliance = new Appliance();
        appliance.setPowerConsumption('C');
        appliance.setWeight(20);
        appliance.finalPrice();
        price = appliance.getPrice();

        assertEquals(1100.0, price, 0);
        assertNotEquals(2000.0, price, 0);

    }

    
    
    
}
