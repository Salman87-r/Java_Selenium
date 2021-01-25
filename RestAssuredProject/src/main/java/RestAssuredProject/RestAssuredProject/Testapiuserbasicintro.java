package RestAssuredProject.RestAssuredProject;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
public class Testapiuserbasicintro 
{
	@Test
	public  void test1()
	{
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		int sts=response.getStatusCode();
		Assert.assertEquals(sts, 200);
	}
	@Test
	public void test_2() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
	@Test
	public void Test_3() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]",equalTo(7))
		.log().all();

	}

}
