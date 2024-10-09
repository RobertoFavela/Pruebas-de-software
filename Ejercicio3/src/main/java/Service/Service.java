/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import com.mycompany.ejercicio3.ExternalAPI.ExternalAPIService;

/**
 *
 * @author Usuario
 */
public class Service {
    
    private ExternalAPIService _apiClient;
    
    public Service(ExternalAPIService apiClient){
        this._apiClient = apiClient;        
    }
    
    // Método para obtener un post por su ID
    public String getPostById(int postId) {
        try {
            return _apiClient.getPostById(postId);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error fetching post by ID: " + e.getMessage();
        }
    }

    // Método para obtener todos los posts
    public String getAllPosts() {
        try {
            return _apiClient.getAllPosts();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error fetching all posts: " + e.getMessage();
        }
    }

    // Método para crear un nuevo post
    public String createPost(String title, String body, int userId) {
        try {
            return _apiClient.createPost(title, body, userId);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error creating new post: " + e.getMessage();
        }
    }

    // Método para actualizar un post existente
    public String updatePost(int postId, String title, String body, int userId) {
        try {
            return _apiClient.updatePost(postId, title, body, userId);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error updating post: " + e.getMessage();
        }
    }

    // Método para eliminar un post por su ID
    public String deletePost(int postId) {
        try {
            return _apiClient.deletePost(postId);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error deleting post: " + e.getMessage();
        }
    }
    
}
