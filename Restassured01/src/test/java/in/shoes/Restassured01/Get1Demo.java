package in.shoes.Restassured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get1Demo {
	@Test



	public void getServerResponse() {


	RestAssured
	.when()
	.get("http://localhost:9010/get-shoes")
	.then()


	.assertThat()
	.statusCode (200)
	.log().all();
	 
	}


}
