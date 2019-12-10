package com.CucumberFramework.StepDefenitions;

import org.json.JSONObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class apitesting {
	
	Response response;
	
	@When("^users upload data on a project$")
	public void users_upload_data_on_a_project() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("FirstName", "Bhavik"); // Cast
		 requestParams.put("LastName", "Testing");
		 requestParams.put("UserName", "bhavik");
		 requestParams.put("Password", "password1");		 
		 requestParams.put("Email",  "bhavikTest@gmail.com");
		 
		 request.body(requestParams.toString());
		 response = request.post("/register");		
	}

	@Then("^the server should handle it and return a success status$")
	public void the_server_should_handle_it_and_return_a_success_status() throws Throwable {
		Assert.assertEquals(200, response.getStatusCode());
		Assert.assertEquals("HTTP/1.1 200 OK", response.getStatusLine());
	}

	@When("^users want to get information on the Cucumber project$")
	public void users_want_to_get_information_on_the_Cucumber_project() throws Throwable {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/Hyderabad");
	}

	@Then("^the requested data is returned$")
	public void the_requested_data_is_returned() throws Throwable {
		Assert.assertEquals(200, response.getStatusCode());
		Assert.assertEquals("HTTP/1.1 200 OK", response.getStatusLine());
	}

}
