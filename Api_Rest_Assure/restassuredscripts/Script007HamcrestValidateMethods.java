package restassuredscripts;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Script007HamcrestValidateMethods {
	
	// Hamcrest dependency has been added to your POM file
	// This dependency provides us many validation methods that help us to validate the response code
	
	// equalTo() Hamcrest method
	
	@Test(priority='1')
	public void ValidateResponseBody() {
		
		String PMapikey="PMAK-65804703822c1c1500f17582-906259766495c62ff43f1a18c0a7e01584";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMapikey )
		.when().get()
		.then().statusCode(200)
		//fetch the resonse body and validate if response includes correct values or not
		
		.body("workspaces[3].id", equalTo("87ee7346-1da8-40ab-ad18-5d660adc0e80"),
				"workspaces[3].name", equalTo("phase_3_postman"),
				"workspaces[3].type", equalTo("personal"));
			  	
	}
	
	@Test(priority='2')
	public void ValidateResponseBody_equalTo() {
		
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/parikhmalay")
		.when().get()
		.then().statusCode(200)
		//fetch the response body and validate if response includes correct values or not
		//+++created in a website(post) and get from it and cjeck
		.body("username", equalTo("parikhmalay"),
			 ("firstName"),equalTo("malay"),
			 ("lastName"),equalTo("parikh"),
			 ("email"),equalTo("Positive@Attitude.com"),
			 ("userStatus"),equalTo(1));
			 
			 		
	}
	@Test(priority='3')
	public void ValidateResponseBody_hasItems() {
		
		String PMapikey="PMAK-65804703822c1c1500f17582-906259766495c62ff43f1a18c0a7e01584";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMapikey )
		.when().get()
		.then().statusCode(200)
		// fetch the response body and validate if response includes correct values or not + have this name or not
		
		.body("workspaces.name", hasItems("Team Workspace", "My Workspace", "Workspace-2"),
			 "workspaces.type", hasItems("team", "personal"));
		
		
	}
	
	

}