package br.com.boavista;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class App {
    public static void main( String[] args ) {
        RestTemplate client = new RestTemplate();
//        String endpoint = "http://localhost:8080/ola";
        String url = "http://localhost:8080/ola";
        ResponseEntity<String> response = client.getForEntity(url, String.class);        
        System.out.println(response.getBody());
    }
}
