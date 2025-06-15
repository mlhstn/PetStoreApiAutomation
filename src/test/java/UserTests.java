import Base.BaseTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class UserTests extends BaseTest {

    @Test(description = "Get - /v2/user - UserInfo", priority = 2)
    public void GetUserInfo() {

        Get(URL + "/v2/user/ahmet");


    }

    @Test(description = "Post - /v2/user - User Create", priority = 1)
    public void CreateUser() {

        Map<String, Object> headerPayload = new HashMap<>();
        headerPayload.put("accept", "application/json");
        headerPayload.put("Content-Type", "application/json");

        Map<String, Object> bodyPayload = new HashMap<>();
        bodyPayload.put("id", "131");
        bodyPayload.put("username", "ahmet");
        bodyPayload.put("firstName", "melih");
        bodyPayload.put("lastName", "üstün");
        bodyPayload.put("email", "melih@gmail.com");
        bodyPayload.put("password", "sfsdfsdfs");
        bodyPayload.put("phone", "4443335522");
        bodyPayload.put("userStatus", "1");

        Post(URL + "/v2/user", headerPayload, bodyPayload);

    }

    @Test(description = "Put - /v2/user/ - Update User", priority = 3)
    public void UpdateUser() {

        Map<String, Object> headerPayload = new HashMap<>();
        headerPayload.put("accept", "application/json");
        headerPayload.put("Content-Type", "application/json");


        Map<String, Object> bodyPayload = new HashMap<>();
        bodyPayload.put("id", "131");
        bodyPayload.put("username", "melihhhh11");
        bodyPayload.put("firstName", "melih");
        bodyPayload.put("lastName", "üstün");
        bodyPayload.put("email", "melih@gmail.com");
        bodyPayload.put("password", "sfsdfsdfs");
        bodyPayload.put("phone", "4443335522");
        bodyPayload.put("userStatus", "1");


        Put(URL + "/v2/user/ahmet", bodyPayload, headerPayload);

    }

    @Test(description = "Delete - v2/user - Delete User", priority = 4)
    public void DeleteUser() {


        Delete(URL + "/v2/user/melihhhh11");

    }

    @Test(description = "Get - /v2/user/login - Login")
    public void Login() {

        Map<String, Object> queryParamsPayload = new HashMap<>();

        Get(URL + "/v2/user/login", queryParamsPayload);
    }

    @Test(description = "Get - /v2/user/logout - Logout")
    public void Logout() {

        Get(URL + "/v2/user/logout");

    }


}
