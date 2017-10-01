package webservice;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

/**
 * Created by akbar on 9/30/2017.
 */
public class SmokeTest extends CommonHelper {

    private static String uri = "https://akbar-app.herokuapp.com/";
    private static ResponseEntity<String> response;

    //checking if the application is up and can integrate
    @Test
    public void healthCheck() {
        String expectedJson = "IT'S UP! Ayo Rama :)";
        response = resourceClient(uri + "health", HttpMethod.GET);
        assertEquals("Failed, status code mismatch:", 200, response.getStatusCodeValue());
        assertEquals("Failed, response body mismatch:", expectedJson, response.getBody().toString().trim());
    }



}
