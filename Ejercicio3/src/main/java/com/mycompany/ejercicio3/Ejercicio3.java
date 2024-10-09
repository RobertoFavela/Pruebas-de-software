/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import Service.Service;
import com.mycompany.ejercicio3.ExternalAPI.ExternalAPIService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        try {
            ExternalAPIService client = new ExternalAPIService();
            Service service = new Service(client);
            
             // Prueba para obtener un post por ID
            System.out.println("GET Post by ID:");
            System.out.println(service.getPostById(1));

            // Prueba para obtener todos los posts
            System.out.println("\nGET All Posts:");
            System.out.println(service.getAllPosts());

            // Prueba para crear un nuevo post
            System.out.println("\nPOST Create New Post:");
            System.out.println(service.createPost("Test Title", "Test Body", 1));

            // Prueba para actualizar un post
            System.out.println("\nPUT Update Post:");
            System.out.println(service.updatePost(1, "Updated Title", "Updated Body", 1));

            // Prueba para eliminar un post
            System.out.println("\nDELETE Post:");
            System.out.println(service.deletePost(1));
        } catch (Exception ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
