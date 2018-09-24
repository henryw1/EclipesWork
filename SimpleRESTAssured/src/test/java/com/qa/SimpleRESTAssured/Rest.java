package com.qa.SimpleRESTAssured;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static io.restassured.RestAssured.*;

import com.google.common.annotations.Beta;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import groovy.transform.ASTTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Rest {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
	Constants  constant =  new Constants();
	
	@Before
	public void setup() {
		

	}
//	
//	@Test
//	public void restToReturn200(){
//
//		given()
//        .contentType(ContentType.JSON)
//    .when()
//        .get("http://www.omdbapi.com/?i=tt3896198&apikey=134a371a&t=IT")
//    .then().statusCode(200).
//    body("Rated", equalTo("R"))
//    ;
//    request = given().contentType(ContentType.JSON);
//    response = request.when().get("http://www.omdbapi.com/?apikey=?????????&t=IT&y=2017");
//    System.out.println("response: " + response.prettyPrint());
//	}
	
	
	
	@Given("^a film exists with the Title Guardians of the Galaxy Two$")
	public void a_film_exists_with_the_Title_Guardians_of_the_Galaxy_Two() throws Throwable {
		request = given ().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title Guardians of the Galaxy Two$")
	public void a_user_retrieves_the_film_by_the_title_Guardians_of_the_Galaxy_Two() throws Throwable {
	   
	    response = request.when().get(constant.API_PATH + "&t=Guardians of the Galaxy");
	}

	@Then("^the status code reads (\\d+)$")
	public void the_status_code_reads(int arg1) throws Throwable {
	 json = response.then().statusCode(200);
	}

	@Given("^a film exists with the Title IT$")
	public void a_film_exists_with_the_Title_IT() throws Throwable {
		request = given().contentType(ContentType.JSON);
	}

	@When("^a user retrieves the film by the title IT$")
	public void a_user_retrieves_the_film_by_the_title_IT() throws Throwable {
		
		response =request.when().get(constant.API_PATH );
	
	}

	@Then("^the Rated Field is equal to R$")
	public void the_Rated_Field_is_equal_to_R() throws Throwable {

		response.then().body("Rated", equalTo("PG-13"));
		System.out.println(response.getBody().prettyPrint());
	    }

	@Given("^a film exists with the Title \"([^\"]*)\"$")
	public void a_film_exists_with_the_Title(String arg1) throws Throwable {
	  
	    request = given().contentType(ContentType.JSON);
	    response = request.when().get(constant.API_PATH + "&"+ arg1); 
	}

	@When("^a user retrieves the film by the title \"([^\"]*)\"$")
	public void a_user_retrieves_the_film_by_the_title(String arg1) throws Throwable {
		response.then().body("Title", equalTo(arg1));
	    
	}

	@Then("^the Rated Field is equal to \"([^\"]*)\"$")
	public void the_Rated_Field_is_equal_to(String arg1) throws Throwable {

	    throw new PendingException();
	}
	
	
}
