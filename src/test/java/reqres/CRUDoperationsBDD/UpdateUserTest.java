package reqres.CRUDoperationsBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateUserTest {
@Test
public void updateUserTest() {
	JSONObject obj=new JSONObject();
	obj.put("name", "ferguson");
	obj.put("job", "zion resident");
	
	baseURI="https://reqres.in";
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.patch("/api/user/2")
	.then()
	.log().all()
	.assertThat()
	.statusCode(200);
}
}
