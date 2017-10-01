package webservice;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

/**
 * Created by akbar on 9/30/2017.
 */
public class MyRestAppTest extends CommonHelper {

    private static String uri = "https://akbar-app.herokuapp.com/";
    private static ResponseEntity<String> response;
    private String expectedJson;
    private String requestBody;
    private int id;


    @Test
    public void getUserById() {
        id = 2;
        //TODO read the expected file from resources instead.
        expectedJson = "{\"id\":2,\"firstName\":\"Dr.\",\"getLastName\":\"Hasan\"}";
        response = resourceClient(uri + "users/" + id, HttpMethod.GET);
        assertEquals("Failed, status code mismatch:", 200, response.getStatusCodeValue());
        assertEquals("Failed, response body mismatch:", expectedJson, response.getBody().toString().trim());
    }

    //TODO: write tests to hit all other methods (POST, PUT, DELETE) and negative tests


}
