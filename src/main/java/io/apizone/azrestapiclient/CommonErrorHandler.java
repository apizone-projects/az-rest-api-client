/**
 * 
 */
package io.apizone.azrestapiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus.Series;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * @author schowdhary
 *
 */
public class CommonErrorHandler implements ResponseErrorHandler {

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		
		System.out.println("------- Error in Common Block (Response Code): " 	+ response.getRawStatusCode());
		String errorStreamBody = new BufferedReader(new InputStreamReader(response.getBody())).lines().collect(Collectors.joining("\n"));
		System.out.println("------- Error in Common Block (Response Payload): " + errorStreamBody);

		
		//If required to handle by specific Error Codes
		/*if (response.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
			// handle SERVER_ERROR
		} else if (response.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
			// handle CLIENT_ERROR
			if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
				//throw new Exception("404 --- Classic Not Found!");
			}
		}*/

	}


	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return  (response.getStatusCode().series() == Series.CLIENT_ERROR  || response.getStatusCode().series() == Series.SERVER_ERROR);
	}
	
	
	

}
