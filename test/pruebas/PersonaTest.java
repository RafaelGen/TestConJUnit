/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.personas.Persona;
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
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Antes de la clase");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("despues de la clase");
    }
    
    @Before
    public void setUp() {
        System.out.println("antes C:");
    }
    
    @After
    public void tearDown() {
        System.out.println("despues C:");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void personaTest() {
    System.out.println("primer test");
    String nombre = "juanito";
    String apellido = "de la mar";
    int edad = 20;
    Persona p1 = new Persona("juanito","de la mar",20);
    assertEquals(("El nombre es " + nombre + " " +apellido
                + " edad: " + edad + " años"), p1.toString());
    }
    
    @Test
    public void stringVerificador(){
        System.out.println("segundo test");
    String cadena = new String("Hola amigos");
    String cadena1 = new String("Hola amigos");
    assertEquals(cadena,cadena1);
    }
}
