package reqres.CRUDOpertions;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsersTest {
@Test
public void getAllUsersTest()
{
	//step 1: create prerequisties
	//step 2: send Request
	
	Response response=RestAssured.get("https://reqres.in/api/users?page=2");
	//step 3: validate response
	ValidatableResponse val=response.then();
	val.assertThat().statusCode(200);
	val.log().all();
}
}
