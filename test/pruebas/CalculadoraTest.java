/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.servicios.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafaelm
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void sumarTest() {
         int a = 3;
         int b = 2;
         int resultado = Calculadora.sumar(a, b);
         int esperado = 5;
         assertEquals(resultado,esperado);
    }
     
     @Test
     public void restarTest(){
         int a = 3;
         int b = 2;
         int resultado = Calculadora.restar(a, b);
         int esperado = 1;
         assertEquals(esperado,resultado);
     }
     
     
}
