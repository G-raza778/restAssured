package reqres.ResponseValidation;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class requestChainingGetAndDelete {
@Test
public void getAndDeleteUSerTest() {
	baseURI="https://reqres.in";

Response response= get("/api/users/2");
int id=response.jsonPath().getInt("data.id");
response.then()
.assertThat()
.statusCode(200)
.log().all();
when()
.delete("/api/users/"+id)
.then()
.assertThat()
.statusCode(204)
.log().all();

}


}

