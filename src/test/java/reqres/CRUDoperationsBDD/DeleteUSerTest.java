package reqres.CRUDoperationsBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteUSerTest {
@Test
public void deleteUserTest() {
	baseURI="https://reqres.in";
	when()
	.delete("/api/users/2")
	.then()
	.log().all()
	.assertThat()
	.statusCode(204);
}
}
