package apiAutomationTesting;
import org.testng.annotations.*;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class groupOne {
	
	
	Properties prop;

	@BeforeClass
	public void commonClass() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\config.properties");
		prop.load(fis);
		String baseUrl = prop.getProperty("url");
		
		RestAssured.baseURI = baseUrl;
	}
	
	
	@Test(priority=1)
	public void authentication()
	{
		given()
		.contentType("application/json")
		.headers("UUID","103f19ed-fd71-4fba-972f-fd4b3b65c999")
		
		.when()
		.get("/WVIE/client/v1.0/authentication")
		
		
		.then()
		.statusCode(200)
		.and()
		.statusLine("HTTP/1.1 200 ");
	}
	
	
	
	@Test(priority=2)
	public void validateUser()
	{
	
		given()
		.contentType("application/json")
		.headers("UUID", "55ad7643-ce3d-4ala-954f-f0a0b2545bd2")
		.body(ReqBody.ValidateUserreqBody)
		
		
		.when()
		.post("/WVIE/client/v1.0/validateUser")
		
		
		.then()
		.statusCode(200)
		.and()
		.statusLine("HTTP/1.1 200 ");
	
		
	}
	
	
	
	@Test(priority=3)
	public void getClientAppointments()
	{
		given()
		.contentType("application/json")
		.headers("UUID", "55ad7643-ce3d-4ala-954f-f0a0b2545bd2")
		
		.when()
		.get("https://wvie-api-gw-perf-stg.optum.com/WVIE/client/v1.0/swagger-ui.html#!/client-appointments-controller/getClientAppointments")
		
		.then()
		.statusCode(200)
		.and()
		.statusLine("HTTP/1.1 200 ");
		
		
	}
	
	
	@Test(priority=4)
	public void benFinder()
	{

		given()
		.contentType("application/json")
		.headers("UUID", "55ad7643-ce3d-4ala-954f-f0a0b2545bd2")
		.body(ReqBody.benFinReqBody)
		
		.when()
		.post("/WVIE/benefitFinder/v1.0/benefitFinder")
		
		.then()
		.statusCode(200)
		.and()
		.statusLine("HTTP/1.1 200 ");
	}
	
	
	@Test(priority=5)
	public void cummunityPartner()
	{
		given()
		.contentType("application/json")
		.headers("UUID", "55ad7643-ce3d-4ala-954f-f0a0b2545bd2")
		
		.when()
		.get("/WVIE/communityPartnerSearch/v1.0/communityPartner/mason")
		
		.then()
		.statusCode(200)
		.and()
		.statusLine("HTTP/1.1 200 ");
	}
	
	@Test(priority=6)
	public void stateCounty()
	{
		given()
		.contentType("application/json")
		.header("UUID", "55ad7643-ce3d-4ala-954f-f0a0b2545bd2")
		
		.when()
		.get("/WVIE/stcnty/v1.0/statecounty?state=WV")
		
		
		.then()
		.statusCode(200)
		.and()
		.statusLine("HTTP/1.1 200 ");
	}
	
	@Test(priority=7)
	public void getIncomeLimits()
	{
		given().contentType("application/json").headers("UUID", "55ad7643-ce3d-4ala-954f-f0a0b2545bd2")
		.body(ReqBody.getIncomeLimitsReqBody)
		
		.when().post("/WVIE/client/v1.0/getIncomeLimits")
		
		.then()
		.statusCode(200)
		.and()
		.statusLine("HTTP/1.1 200 ");
		
	}

}
