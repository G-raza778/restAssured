package reqres.CRUDOpertions;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ModifyUserTest {
@Test
public void updateUSerTest() {
	JSONObject obj=new JSONObject();
	obj.put("name", "ferguson");
	obj.put("job","zion resident");
	
	RequestSpecification request=RestAssured.given();
	request.body(obj);
	request.contentType(ContentType.JSON);
	Response response=request.put("https://reqres.in/api/users/2");
	ValidatableResponse val=response.then();
	val.assertThat().statusCode(200);
	val.log().all();
}
}
