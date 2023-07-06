package reqres.CRUDOpertions;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUsertest {
@Test
public void CreateUserTest()
{

  //step 1: Create pre-requisitiessend
	JSONObject obj=new JSONObject();
	obj.put("name", "morpheus");
	obj.put("job", "leader");
	RequestSpecification request=RestAssured.given();
	request.body(obj);
	request.contentType(ContentType.JSON);
	
	//step 2: send the request  
	Response response=request.post("https://reqres.in/api/users");
	 
	//step 3: validate response
	ValidatableResponse val=response.then();
	val.assertThat().statusCode(201);
	val.log().all();
}
}
