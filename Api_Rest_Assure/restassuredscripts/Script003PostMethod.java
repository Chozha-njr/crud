package restassuredscripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script003PostMethod {
	
	

	@Test
	
	public void postMethod() {
		
		HashMap<String, String> map =new HashMap<String,String>();
		
		map.put("name","john");
		map.put("jobs","QA Engineer");
		
		System.out.println(map);
		
		RestAssured
		.given() .baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType("application/json")
		.body(map)
		.when().post()
		.then().statusCode(201).log().all();
		
	}

}
