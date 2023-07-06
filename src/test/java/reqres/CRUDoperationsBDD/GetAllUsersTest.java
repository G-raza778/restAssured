package reqres.CRUDoperationsBDD;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetAllUsersTest {
@Test
public void getAllUserTest() {
given()
	.get("https://reqres.in/api/users/page=2")
	.then()
	.log().all()
	.assertThat()
	.statusCode(200);
}
}
