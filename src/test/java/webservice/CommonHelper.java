package webservice;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

/**
 * Created by akbar on 9/30/2017.
 */
public class CommonHelper {

    private static HttpHeaders headers;
    private static TestRestTemplate restTemplate;
    private static HttpEntity<String> httpEntity;

    public ResponseEntity<String> resourceClient(String uri, HttpMethod methodType) {
        headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        restTemplate = new TestRestTemplate();
        httpEntity = new HttpEntity<String>(null, headers);
        return restTemplate.exchange(uri, methodType, httpEntity, String.class);
    }

    //TODO: create helper method to read expected json file

    //TODO: create helper assert method with error collector


}
