/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Service;

import com.mycompany.ejercicio3.ExternalAPI.ExternalAPIService;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 *
 * @author Usuario
 */
public class ServiceTest {

    //@Mock
    private ExternalAPIService _apiClient;

    //@InjectMocks
    private Service _service;

    public ServiceTest() {
//        _apiClient = new ExternalAPIService();
//        _apiClient = Mockito.mock(ExternalAPIService.class);
//        _service = new Service(_apiClient);
    }

    /**
     * Test of getPostById method, of class Service.
     */
    @Test
    public void testGetPostById() {

    }

    /**
     * Test of getAllPosts method, of class Service.
     */
    @Test
    public void testGetAllPosts() {
        // Arrange
        try {
            Mockito.when(_apiClient.getAllPosts()).thenReturn("test");
            String result = "";

            // Act
            result = _service.getAllPosts();

            // Assert
            assertEquals("test", result);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    /**
     * Test of createPost method, of class Service.
     */
    @Test
    public void testCreatePost() {

    }

    /**
     * Test of updatePost method, of class Service.
     */
    @Test
    public void testUpdatePost() {

    }

    /**
     * Test of deletePost method, of class Service.
     */
    @Test
    public void testDeletePost() {

    }

}
