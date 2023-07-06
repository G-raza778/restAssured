package reqres.serialisationDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClasses.petStoreUserLibrary;

public class DeseriallisationTest {
@Test
public void deserialisation() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper mapper=new ObjectMapper();
	petStoreUserLibrary obj=mapper.readValue(new File("./src/test/resources/petStore.json"),petStoreUserLibrary.class);
	System.out.println(obj.getId());
	System.out.println(obj.getUsername());
	System.out.println(obj.getFirstname());
	System.out.println(obj.getLastname());
	System.out.println(obj.getEmail());
	System.out.println(obj.getPassword());
	System.out.println(obj.getPhone());
	System.out.println(obj.getUserStatus());
}
}
