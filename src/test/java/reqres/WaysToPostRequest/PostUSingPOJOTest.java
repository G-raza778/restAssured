package reqres.WaysToPostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import pojoClasses.ReqresLibrary;

public class PostUSingPOJOTest {
@Test
public void createUSerTest() {
	ReqresLibrary obj=new ReqresLibrary("srivalli","trainer");
	baseURI="https://reqres.in";
	given()
	.body(obj)
	.post("/api/users")
	.then()
	.log().all()
	.assertThat()
	.statusCode(201);
}
}
