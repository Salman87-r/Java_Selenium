package RestAssuredProject.RestAssuredProject;

import java.util.HashMap;
import java.util.Map;

import org.json.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class Testapibuildin {
	//get,post,put,patch,delete
	//Get data from reqres app
	public void Test1_get() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[1]",equalTo(8))
		.body("data.first_name",hasItems("Michael","Lindsay"));
		//.log().all();
	}
	//Difference between map and json object 
	@Test
	public void Test_1_Postmap() {
		Map<String,Object> map=new HashMap<String,Object>(); 
		map.put("name","morpheus");
		map.put("job", "leader");
		System.out.println(map);
		JSONObject request =new JSONObject();
		request.put("name","morpheus");
		request.put("job", "leader");
		System.out.println(request);
	}
	//@Test
	public void Test_2_Postjson() {
		JSONObject request =new JSONObject();
		request.put("name","morpheus");
		request.put("job", "leader");
		System.out.println(request);
		given().
		body(request.toString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
		
	}
	//@Test
	public void Test_1_put() {
		JSONObject request =new JSONObject();
		request.put("name","morpheus");
		request.put("job", "leader");
		System.out.println(request);
		given().
		contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("Content-Type", "application/json").
		body(request.toString())
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().all();
		
	}
	//@Test
	public void Test_1_patch() {
		JSONObject request =new JSONObject();
		request.put("name","morpheus");
		request.put("job", "leader");
		given().
		contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("Content-Type", "application/json").
		body(request.toString())
		.when()
		.patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().all();
		
	}
	//@Test
	public void delete() {

		when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204).log().all();
		
	}
}
