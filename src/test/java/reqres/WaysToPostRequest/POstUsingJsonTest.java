package reqres.WaysToPostRequest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class POstUsingJsonTest {
@Test
public void createUserTest() {
	File obj=new File("./src/test/resources/reqresData.json");
	baseURI="https://reqres.in";
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post("/api/users")
	.then()
	.log().all()
	.assertThat()
	.statusCode(200);
}
}
