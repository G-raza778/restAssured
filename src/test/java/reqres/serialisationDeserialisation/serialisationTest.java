package reqres.serialisationDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;


import pojoClasses.petStoreUserLibrary;

public class serialisationTest {
@Test
public void serialisation() throws JsonGenerationException, JsonMappingException, IOException {
	petStoreUserLibrary obj=new petStoreUserLibrary(101,"gulamraza","gulam","raza","gulam.raza778@gmail.com","qwerty@123","7010514178", 123);
	ObjectMapper mapper=new ObjectMapper();
	mapper.writeValue(new File("./src/test/resources/petStore.json"),obj);
}
}
