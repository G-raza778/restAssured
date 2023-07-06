package reqres.CRUDoperationsBDD;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createUserTest {
	public void CreateUSerTest() {
		JSONObject obj=new JSONObject();
		obj.put("name","morpheus");
		obj.put("job", "leader");
		
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.log().all()
	.assertThat()
	.contentType(ContentType.JSON);
	}
}
