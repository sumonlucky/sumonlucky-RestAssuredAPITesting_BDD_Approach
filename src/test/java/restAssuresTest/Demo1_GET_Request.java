package restAssuresTest;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;



public class Demo1_GET_Request {

	@Test
	public void getWeatherDetails() {
		
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/new york city")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("City",equalTo ("New York City"))
			.header("Content-Type", "application/json");
			
			
		
		
		
	}

	
	
	
}
