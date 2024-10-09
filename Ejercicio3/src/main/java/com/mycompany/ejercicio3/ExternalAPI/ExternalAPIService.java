/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3.ExternalAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Usuario
 */
public class ExternalAPIService {
    
    private String BASE_URL = "https://jsonplaceholder.typicode.com/";
    
    public ExternalAPIService(){}

    // Método para hacer una solicitud GET
    public String getPostById(int postId) throws Exception {
        URL url = new URL(BASE_URL + "posts/" + postId);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // Success
            return readResponse(connection);
        } else {
            return "GET request failed with code: " + responseCode;
        }
    }

    // Método para hacer una solicitud GET para obtener todos los posts
    public String getAllPosts() throws Exception {
        URL url = new URL(BASE_URL + "posts");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            return readResponse(connection);
        } else {
            return "GET request failed with code: " + responseCode;
        }
    }

    // Método para hacer una solicitud POST (crear un nuevo post)
    public String createPost(String title, String body, int userId) throws Exception {
        URL url = new URL(BASE_URL + "posts");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);

        // Cuerpo del POST en formato JSON
        String jsonInputString = String.format(
                "{\"title\": \"%s\", \"body\": \"%s\", \"userId\": %d}",
                title, body, userId);

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_CREATED) {
            return readResponse(connection);
        } else {
            return "POST request failed with code: " + responseCode;
        }
    }

    // Método para hacer una solicitud PUT (actualizar un post existente)
    public String updatePost(int postId, String title, String body, int userId) throws Exception {
        URL url = new URL(BASE_URL + "posts/" + postId);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);

        // Cuerpo del PUT en formato JSON
        String jsonInputString = String.format(
                "{\"title\": \"%s\", \"body\": \"%s\", \"userId\": %d}",
                title, body, userId);

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            return readResponse(connection);
        } else {
            return "PUT request failed with code: " + responseCode;
        }
    }

    // Método para hacer una solicitud DELETE (eliminar un post)
    public String deletePost(int postId) throws Exception {
        URL url = new URL(BASE_URL + "posts/" + postId);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            return "Post deleted successfully!";
        } else {
            return "DELETE request failed with code: " + responseCode;
        }
    }

    // Método auxiliar para leer la respuesta del servidor
    private String readResponse(HttpURLConnection connection) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();
        return content.toString();
    }
    
}
