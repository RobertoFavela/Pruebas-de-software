/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author favel
 */
public class BibliotecaTest {
    
    private Biblioteca biblioteca;
    private Libro libro;
    
    public BibliotecaTest() {
    }
    
    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        libro = new Libro("El Quijote", "Miguel de Cervantes", 500, 3);
        biblioteca.agregarLibro(libro);
    }

    /**
     * Test of agregarLibro method, of class Biblioteca.
     */
    @Test
    public void testAgregarLibro() {
        //Arrange
        System.out.println("agregarLibro");
        
        //Act
        biblioteca.agregarLibro(libro);
        
        //Assert
        assertEquals(libro, biblioteca.buscarLibro("El Quijote"));
    }

    /**
     * Test of eliminarLibro method, of class Biblioteca.
     */
    @Test
    public void testEliminarLibro() {
        //Arrange
        System.out.println("eliminarLibro");
        boolean expResult = true;
        
        //Act
        boolean result = biblioteca.eliminarLibro(libro.getTitulo());
        
        //Assert
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarLibro method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibro() {
        //Arrange
        System.out.println("buscarLibro");
        
        //Act
        Libro result = biblioteca.buscarLibro(libro.getTitulo());
        
        //Assert
        assertEquals(libro, result);
    }

    /**
     * Test of contarTotalPaginas method, of class Biblioteca.
     */
    @Test
    public void testContarTotalPaginas() {
        //Arrange
        System.out.println("contarTotalPaginas");
        int expResult = libro.getNumeroPaginas();
        
        //Act
        int result = biblioteca.contarTotalPaginas();
        
        //Assert
        assertEquals(expResult, result);
    }

    /**
     * Test of hayCopiasDisponibles method, of class Biblioteca.
     */
    @Test
    public void testHayCopiasDisponibles() {
        //Arrange
        System.out.println("hayCopiasDisponibles");
        boolean expResult = true;
        
        //Act
        boolean result = biblioteca.hayCopiasDisponibles(libro.getTitulo());
        
        //Assert
        assertEquals(expResult, result);
    }
    
}
