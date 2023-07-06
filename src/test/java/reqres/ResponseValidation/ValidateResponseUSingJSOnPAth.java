package reqres.ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class ValidateResponseUSingJSOnPAth {
@Test
public void getUSerTest() {
	baseURI="https://reqres.in";
	
	Response response=get("/api/users?page=2");
	String name=response.jsonPath().getString("data[4].first_name");
	
	response.then()
	.log().all()
	.assertThat()
	.statusCode(200);
	Assert.assertEquals(name,"george");
}

private Response get(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
