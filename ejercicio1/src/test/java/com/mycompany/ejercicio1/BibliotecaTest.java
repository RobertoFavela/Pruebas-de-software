/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.ejercicio1.

/**
 *
 * @author favel
 */
public class BibliotecaTest {
    
    private Libro libro;
    private Biblioteca Biblioteca:
    
    public BibliotecaTest() {
    }

    /**
     * Test of agregarLibro method, of class Biblioteca.
     */
    @Test
    public void testAgregarLibro() {
        System.out.println("agregarLibro");
        Libro libro = null;
        Biblioteca instance = new Biblioteca();
        instance.agregarLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLibro method, of class Biblioteca.
     */
    @Test
    public void testEliminarLibro() {
        System.out.println("eliminarLibro");
        String titulo = "";
        Biblioteca instance = new Biblioteca();
        boolean expResult = false;
        boolean result = instance.eliminarLibro(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibro method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibro() {
        System.out.println("buscarLibro");
        String titulo = "";
        Biblioteca instance = new Biblioteca();
        Libro expResult = null;
        Libro result = instance.buscarLibro(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarTotalPaginas method, of class Biblioteca.
     */
    @Test
    public void testContarTotalPaginas() {
        System.out.println("contarTotalPaginas");
        Biblioteca instance = new Biblioteca();
        int expResult = 0;
        int result = instance.contarTotalPaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hayCopiasDisponibles method, of class Biblioteca.
     */
    @Test
    public void testHayCopiasDisponibles() {
        System.out.println("hayCopiasDisponibles");
        String titulo = "";
        Biblioteca instance = new Biblioteca();
        boolean expResult = false;
        boolean result = instance.hayCopiasDisponibles(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
