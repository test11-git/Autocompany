package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured {

	
	
	
	@Test
	public void getweatherdetails() {
		
		//specify base URI
		io.restassured.RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		//request object
		RequestSpecification httprequest=io.restassured.RestAssured.given();
		
		//response object
		Response response=httprequest.request(Method.GET, "/employee");
		
		
		//print response in console window
		String responsebody=response.getBody().asString();
		System.out.println("Response body is:"+responsebody);
		
		//status code validation
		int statuscode=response.getStatusCode();
		System.out.println("Response code is:"+statuscode);
		Assert.assertEquals(statuscode, 200);
		
		//status line verification
		
		String statusline=response.getStatusLine();
		System.out.println(statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
		
		
		
		
		
		
		
		
		
		
	}
}
