package Base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BaseLibrary{


    public void BeforeTest(){

        RestAssured.baseURI=URL;

    }
}
