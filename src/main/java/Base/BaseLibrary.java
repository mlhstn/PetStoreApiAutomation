package Base;

import io.qameta.allure.Step;
import io.restassured.RestAssured;

import java.util.Map;

public class BaseLibrary extends Data {

    @Step(" {urlPath} Get isteği gönderilir")
    public void Get(String urlPath) {
        RestAssured.get(urlPath).then().statusCode(200);
    }

    @Step(" {urlPath} Post isteği gönderilir")
    public void Post(String urlPath, Map<String, Object> bodyPayload, Map<String, Object> headerPayload) {
        RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .body(bodyPayload).headers(headerPayload).when().post(urlPath).then().statusCode(200);
    }

    @Step(" {urlPath} Put isteği gönderilir")
    public void Put(String urlPath, Map<String, Object> bodyPayload, Map<String, Object> headerPayload) {
        RestAssured.given().body(bodyPayload).headers(headerPayload).when().put(urlPath).then().statusCode(200);
    }

    @Step(" {urlPath} Post isteği gönderilir")
    public void Delete(String urlPath) {
        RestAssured.delete(urlPath).then().statusCode(200);
    }

    @Step(" {urlPath} Get isteği gönderilir")
    public void Get(String urlPath, Map<String, Object> queryParamsPayload) {
        RestAssured.given().queryParams(queryParamsPayload).when().get(urlPath).then().statusCode(200);
    }


}
