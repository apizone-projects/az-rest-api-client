package io.apizone.azrestapiclient;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * @author schowdhary
 *
 */


@SpringBootApplication
public class Customer360GetClient {


	private static String ENDPOINT_SFCM 			= "https://ca.apizone.com:38443/apizone-gateway/APZK/AZCoreServices/1.0/co/query-customer-360/---------";
	private static String AUTH_TOKEN 				= "Bearer $AUTH_TOKEN";
	private static String API_KEY 					= "010cd97d-7c56-4907-bfb5-f4cb7287e4d3";

	private static String DEFUALT_STORE_TYPE 		= "JKS";
	private static String CERT_LOCATION 			= "/tmp/apizone.jks"; 
	private static String CERT_PASSWORD				= "$CERT_PASS";


	public static void main(String[] args) throws JsonProcessingException {

		// Client Keystore
		System.setProperty("javax.net.ssl.keyStoreType", 		DEFUALT_STORE_TYPE);
		System.setProperty("javax.net.ssl.keyStore", 			CERT_LOCATION);
		System.setProperty("javax.net.ssl.keyStorePassword", 	CERT_PASSWORD);

		// Client Truststore
		System.setProperty("javax.net.ssl.trustStoreType", 		DEFUALT_STORE_TYPE);
		System.setProperty("javax.net.ssl.trustStore", 			CERT_LOCATION);
		System.setProperty("javax.net.ssl.trustStorePassword",  CERT_PASSWORD);


		SpringApplication.run(Customer360GetClient.class, args);


		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setErrorHandler(new CommonErrorHandler());		//Common Error Handler for Non 200 Responses


		//Headers
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN }));
//		headers.add("Content-Type", 		"application/json");
		headers.add("X-API-Key", 			API_KEY);
		headers.add("Authorization", 		AUTH_TOKEN);
		headers.setContentType(MediaType.APPLICATION_JSON);

		
		//1. Data attached to the request.
		HttpEntity<String> requestBody = new HttpEntity<>(headers);

		//2. Send request with POST method.
		try {
			ResponseEntity<String> result = restTemplate.exchange(ENDPOINT_SFCM, HttpMethod.GET, requestBody, String.class); 

			System.out.println("Status code:" + result.getStatusCode());
			if (result.getStatusCode() == HttpStatus.OK || result.getStatusCode() == HttpStatus.CREATED) {
				String responsePayload = result.getBody();
				System.out.println("------- Response Payload: "+ responsePayload);
				
			
			} 
		} catch (Exception e) {
			//System.out.println("------- Error Block Response Payload: " + e.getMessage());
		}
		
		
		
		

	}

}
