/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class InterfazTest {
    
    public InterfazTest() {
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
     * Test of Insertar method, of class Interfaz.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Interfaz instance = new Interfaz();
        instance.Insertar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaVacia method, of class Interfaz.
     */
    @Test
    public void testListaVacia() {
        System.out.println("listaVacia");
        Interfaz instance = new Interfaz();
        boolean expResult = false;
        boolean result = instance.listaVacia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class Interfaz.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Interfaz instance = new Interfaz();
        instance.Eliminar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Recorrer method, of class Interfaz.
     */
    @Test
    public void testRecorrer() {
        System.out.println("Recorrer");
        Interfaz instance = new Interfaz();
        instance.Recorrer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Interfaz.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Interfaz.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
