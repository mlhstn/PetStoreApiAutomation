import Base.BaseTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class UserTests extends BaseTest {

    @Test(description = "Get - /v2/user - UserInfo", priority = 2)
    public void GetUserInfo() {

        Get(URL + "/v2/user/gzd");


    }

    @Test(description = "Post - /v2/user - User Create", priority = 1)
    public void CreateUser() {

        Map<String, Object> headerPayload = new HashMap<>();
        headerPayload.put("accept", "application/json");
        headerPayload.put("Content-Type", "application/json");

        Map<String, Object> bodyPayload = new HashMap<>();
        bodyPayload.put("id", "6666");
        bodyPayload.put("username", "gzd");
        bodyPayload.put("firstName", "gözde");
        bodyPayload.put("lastName", "üstün");
        bodyPayload.put("email", "gözde@gmail.com");
        bodyPayload.put("password", "sfsdfsdfs");
        bodyPayload.put("phone", "12345");
        bodyPayload.put("userStatus", "1");

        Post(URL + "/v2/user", headerPayload, bodyPayload);

    }

    @Test(description = "Put - /v2/user/ - Update User", priority = 3)
    public void UpdateUser() {

        Map<String, Object> headerPayload = new HashMap<>();
        headerPayload.put("accept", "application/json");
        headerPayload.put("Content-Type", "application/json");


        Map<String, Object> bodyPayload = new HashMap<>();
        bodyPayload.put("id", "6666");
        bodyPayload.put("username", "gzd");
        bodyPayload.put("firstName", "melih");
        bodyPayload.put("lastName", "üstün");
        bodyPayload.put("email", "gözde@gmail.com");
        bodyPayload.put("password", "12345");
        bodyPayload.put("phone", "4443335522");
        bodyPayload.put("userStatus", "1");


        Put(URL + "/v2/user/ahmet", bodyPayload, headerPayload);

    }

    @Test(description = "Delete - v2/user - Delete User", priority = 4)
    public void DeleteUser() {


        Delete(URL + "/v2/user/gzd");

    }

    @Test(description = "Get - /v2/user/login - Login")
    public void Login() {

        Map<String, Object> queryParamsPayload = new HashMap<>();
        queryParamsPayload.put("username","ahmet");
        queryParamsPayload.put("password","sfsdfsdfs");

        Get(URL + "/v2/user/login", queryParamsPayload);
    }

    @Test(description = "Get - /v2/user/logout - Logout")
    public void Logout() {

        Get(URL + "/v2/user/logout");

    }


}
