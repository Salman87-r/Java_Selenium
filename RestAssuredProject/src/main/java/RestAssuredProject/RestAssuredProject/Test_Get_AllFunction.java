package RestAssuredProject.RestAssuredProject;

import org.testng.annotations.Test;
import org.json.JSONObject;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class Test_Get_AllFunction {

	//@Test
	public void gettest() {
		baseURI="http://localhost:3000/";
		given()
		.param("Subjectname", "automation")
		.get("/Subjects").
		then().
		statusCode(200).log().all();

	}
	//Post means new user add
	//@Test
	public void createnewusers(){
		JSONObject req=new JSONObject();
		req.put("First_name","Ahsan");
		req.put("Last_name", "Ali");
		req.put("SubjectId", 1);
		baseURI="http://localhost:3000/";
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("Content-Type", "application/json").
		body(req.toString()).
		when().
		post("/users").
		then().
		statusCode(201).log().all();

	}
	//Update 1 specific details through patch
	//@Test
	public void updatedetail(){
		JSONObject req=new JSONObject();

		req.put("Last_name", "malik");

		baseURI="http://localhost:3000/";
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("Content-Type", "application/json").
		body(req.toString()).
		when().
		patch("/users/5").
		then().
		statusCode(200).log().all();

	}
	//replace users through put
	//@Test
	public void updatedetails(){
		JSONObject req=new JSONObject();

		req.put("First_name","Mohsin");
		req.put("Last_name", "Ali");
		req.put("SubjectId", 1);

		baseURI="http://localhost:3000/";
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.header("Content-Type", "application/json").
		body(req.toString()).
		when().
		put("/users/5").
		then().
		statusCode(200).log().all();

	}
	//@Test
	public void del_Data() {
		baseURI="http://localhost:3000/";
		when().
		delete("/users/5").
		then().
		statusCode(200);
	}
	//@Test
	public void getuser() {
		baseURI="http://localhost:3000/";
		given()
		.get("/users").
		then().
		statusCode(200).log().all();

	}
}

