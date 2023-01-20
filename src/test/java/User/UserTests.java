package User;


import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTests {

    @BeforeAll
    public void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/";

    }
}
