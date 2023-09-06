import com.codeborne.selenide.WebDriverRunner;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.Cookie;

import static io.restassured.RestAssured.given;

public class ShowScenarioStatisticsSum extends BaseTest {


    public String GetToken() {

/**
 * Получаем токен
 */
        Cookie cookie = WebDriverRunner.getWebDriver().manage().getCookieNamed("oauth_access_token");
        String access_token = cookie.getValue();
        System.out.println("Значение куки oauth_access_token: " + access_token);
        return access_token;
    }

    public int showStat() {
        /**
         * Запрашиваем по апи PeopleRich
         */
        String url = "https://login.sendpulse.com/api/pop-ups/schema"; // адрес API
        String requestBody = "{\"operationName\":\"showScenarioStatisticsSum\",\"variables\":{\"filter\":{\"scenarioId\":\"0aa2e798-ca4e-45d4-825f-ea89706e0e3e\"},\"locale\":\"ru\"},\"query\":\"query showScenarioStatisticsSum($first: Int, $offset: Int, $filter: ShowScenarioStatisticsSumFilterInterface, $locale: String) {\\n  showScenarioStatisticsSum(first: $first, offset: $offset, filter: $filter) {\\n    edges {\\n      peopleReached\\n      engagements\\n      startedDialogues\\n      formEngagements\\n      subscriptions\\n    }\\n    result(locale: $locale) {\\n      code\\n      errors {\\n        field\\n        message\\n      }\\n    }\\n  }\\n}\\n\"}"; // тело запроса в формате JSON
        String responseBody = given()
                .header("content-type", "Application/json")
                .header("authorization", GetToken())
                .body(requestBody)
                .when()
                .post(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .getBody()
                .asString();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode;
        try {
            jsonNode = objectMapper.readTree(responseBody);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Содержимое ответа" + jsonNode);
        // Получаем значение поля peopleReached из тела ответа
        int peopleReached = jsonNode.get("data").get("showScenarioStatisticsSum").get("edges").get(0).get("peopleReached").asInt();
        int engagements = jsonNode.get("data").get("showScenarioStatisticsSum").get("edges").get(0).get("engagements").asInt();

        System.out.println("People reached: " + peopleReached + "  engagements: " + engagements);
        return (peopleReached);

    }

}
