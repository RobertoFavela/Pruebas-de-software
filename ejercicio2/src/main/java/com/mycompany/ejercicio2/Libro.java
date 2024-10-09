/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author favel
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int copiasDisponibles;

    public Libro(String titulo, String autor, int numeroPaginas, int copiasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void prestarCopia() {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
        }
    }

    public void devolverCopia() {
        copiasDisponibles++;
    }
}
