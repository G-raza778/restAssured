package reqres.WaysToPostRequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postUsingHashmaptest {
@Test
public void createUSerTest() {
	HashMap<String, String>obj=new HashMap<String,String>();
	obj.put("name","morpheus");
	obj.put("job","leader");
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
