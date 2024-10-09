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

    private ExternalAPIService _apiClient;

    private Service _service;

    public ServiceTest() {
        _apiClient = Mockito.mock(ExternalAPIService.class);
        _service = new Service(_apiClient);
    }

    /**
     * Test of getPostById method, of class Service.
     */
    @Test
    public void testGetPostById() {
        String r = "";
        try {
            
            //Arrange
            Mockito.when(_apiClient.getPostById(1)).thenReturn("test");
            
            //Act
            r = _service.getPostById(1);
        } catch (Exception ex) {
            Logger.getLogger(ServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Assert
        assertEquals("test", r);
    }

    /**
     * Test of getAllPosts method, of class Service.
     */
    @Test
    public void testGetAllPosts() {
        String r = "";
        try {
            
            //Arrange
            Mockito.when(_apiClient.getAllPosts()).thenReturn("test");
            
            //Act
            r = _service.getAllPosts();

        } catch (Exception ex) {
            Logger.getLogger(ServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Assert
        Assert.assertEquals("test", r);

    }

    /**
     * Test of createPost method, of class Service.
     */
    @Test
    public void testCreatePost() {
        String r = "";
        try {
            
            //Arrange
            Mockito.when(_apiClient.createPost("post", "post", 0)).thenReturn("test");
            
            //Act
            r = _service.createPost("post", "post", 0);

        } catch (Exception ex) {
            Logger.getLogger(ServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Assert
        assertEquals("test", r);
    }

    /**
     * Test of updatePost method, of class Service.
     */
    @Test
    public void testUpdatePost() {
        String r = "";
        try {
            
            //Arrange
            Mockito.when(_apiClient.updatePost(1, "Post Actualizado", "actulizando post", 1)).thenReturn("test");
            
            //Act
            r = _service.updatePost(1, "Post Actualizado", "actulizando post", 1);

        } catch (Exception ex) {
            Logger.getLogger(ServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Assert
        assertEquals("test", r);
    }

    /**
     * Test of deletePost method, of class Service.
     */
    @Test
    public void testDeletePost() {
        String r = "";
        try {
            
            //Arrange
            Mockito.when(_apiClient.deletePost(1)).thenReturn("test");
            
            // Act
            r = _service.deletePost(1);

        } catch (Exception ex) {
            Logger.getLogger(ServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Assert
        assertEquals("test", r);
    }

}
