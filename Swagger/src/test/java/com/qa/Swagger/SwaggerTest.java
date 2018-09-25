package com.qa.Swagger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;

public class SwaggerTest {
	private Response response; 
	private ValidatableResponse json; 
	private RequestLogSpecification request; 
	Constants constant = new Constants();
	
	
	@Before
	public void setup() {
		// TODO Auto-generated method stub
		

	}
	
	
	@Test
	public void post() {				
		RestAssured.baseURI = constant.BASEURI;
		RequestSpecification request = RestAssured.given();		
		request.header("Content-Type", "application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("city", "Liverpool");
		requestParams.put("description", "This is a test of the post method");
		requestParams.put("name", "Royal Liv");
		requestParams.put("id", 9);
		requestParams.put("rating", 10);		
		System.out.println(request.body(requestParams.toString()));
		Response response = request.post("/");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());	
		

//		
		
//		Response response1 = given().contentType(ContentType.JSON).when().get("http://localhost:8090/example/v1/hotels/7");
//		System.out.println(response.getStatusCode());
//		System.out.println(response.asString());			
		
		
	}
	@Test
	public void Delete() {
		Response response = given().contentType(ContentType.JSON).when().delete(constant.BASEURI+"/3");
			System.out.println(response.getStatusCode());
			System.out.println(response.asString());

	}
	@Test
	public void put() {
		RestAssured.baseURI = constant.BASEURI;
		RequestSpecification request = RestAssured.given();		
		request.header("Content-Type", "application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("city", "Liverpool");
		requestParams.put("description", "This is a test of the put method");
		requestParams.put("name", "Royal Liverpool");
		requestParams.put("id", 9);
		requestParams.put("rating", 10);		
		System.out.println(request.body(requestParams.toString()));
		Response response = request.put("/5");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());

	}
	
	@After
	public void tearDown() {


	}
	

}
