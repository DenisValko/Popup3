package Client;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.example.constants.constants.BASE_URL;
import static org.example.constants.constants.BODY_SHOW_USER_PLAN;
import static org.hamcrest.Matchers.equalTo;

public class ApiCheck {

    public void ShowUserPlans() {

        RestAssured.baseURI = BASE_URL;
        String query = BODY_SHOW_USER_PLAN;
        System.out.println("api_проверка плана");
        given()
                .header("Host", "login.sendpulse.com")
                .header("content-type", "Application/json")
                //.log().all()
                .body(query)
                .when()//.log().all()
                .post("api/pop-ups/schema")
                .then()
                .assertThat().statusCode(200)
                .and().body("data.showUserPlans.edges[0].status",
                        equalTo(1))
                .and().body("data.showUserPlans.result.code", equalTo(200));

    }
}
