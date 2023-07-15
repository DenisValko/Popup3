package Api;
import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ShowScenarioStatisticsSum {

  public int showStat(){


      String url = "https://login.sendpulse.com/api/pop-ups/schema"; // адрес API
      String requestBody = "{\"operationName\":\"showScenarioStatisticsSum\",\"variables\":{\"filter\":{\"scenarioId\":\"0aa2e798-ca4e-45d4-825f-ea89706e0e3e\"},\"locale\":\"ru\"},\"query\":\"query showScenarioStatisticsSum($first: Int, $offset: Int, $filter: ShowScenarioStatisticsSumFilterInterface, $locale: String) {\\n  showScenarioStatisticsSum(first: $first, offset: $offset, filter: $filter) {\\n    edges {\\n      peopleReached\\n      engagements\\n      startedDialogues\\n      formEngagements\\n      subscriptions\\n    }\\n    result(locale: $locale) {\\n      code\\n      errors {\\n        field\\n        message\\n      }\\n    }\\n  }\\n}\\n\"}"; // тело запроса в формате JSON
      String responseBody = given()
              .header("content-type", "Application/json")
//              .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjMyYjZhM2FlN2ZkMzM5OGU1MWRkNDM2NmUwMTk4MjFiOTdiZDU0ZjFjYWViZDEzMzkwYjMzOTU1NDRjYTQyMTI4NTk5NDkzMDA1MmI1NDZmIn0.eyJhdWQiOiJkNTZiYWVlNDczMWJhNzNjZjExOThkZGMwNzgwYjk4ZiIsImp0aSI6IjMyYjZhM2FlN2ZkMzM5OGU1MWRkNDM2NmUwMTk4MjFiOTdiZDU0ZjFjYWViZDEzMzkwYjMzOTU1NDRjYTQyMTI4NTk5NDkzMDA1MmI1NDZmIiwiaWF0IjoxNjg5MzM3MjMyLCJuYmYiOjE2ODkzMzcyMzIsImV4cCI6MTY4OTQyMzYzMiwic3ViIjoiODI5OTU3MCIsInNjb3BlcyI6W10sInVzZXIiOnsiaWQiOjgyOTk1NzAsImdyb3VwX2lkIjpudWxsLCJwYXJlbnRfaWQiOm51bGwsImNvbnRleHQiOnsiYWNjbGltIjoiMCJ9LCJhcmVhIjoibWVtYmVyIn19.lQzvQ3NXAanNAGQ50m7a3vh82KL_L5Uv5JdV6U5dWiGdFc9h6eoKqKt2jyxBExkVpfkjuPsGXO2YeRABDpk177dQrEISbo7ArWiypCn2hNpe4U-WwEABslUmH7Vx8KdYl49SGXmRcaVtLqDc7kpinkVjHjgGv8pMzGSZwK0qlxNlxE7MUEOwMSEQo-6-WHsMZXi_ChW-qzUbBTrBQikGMWrz10mdckeZUh2fBBG7myfwxGA2cNy00GZf1QsAym4yMSYazrsBj_8Cud8BgX7b8CXx8ANpEmtw8OyA1mxtstBNXDtN6eeWzbsljYPGYH3c7E8toLaTMxHASNFC12KE0w")
              .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjA1MTkyYzk3YjkzNjBkN2U2YzZjZDExOTUzMjZhYmYxYjNkNGM3NjY1NWEwYWRhMTJjOGRhNGRlOTg2NzY0M2I4M2FmZWQ2ZTQyYzEyMTQ2In0.eyJhdWQiOiJkNTZiYWVlNDczMWJhNzNjZjExOThkZGMwNzgwYjk4ZiIsImp0aSI6IjA1MTkyYzk3YjkzNjBkN2U2YzZjZDExOTUzMjZhYmYxYjNkNGM3NjY1NWEwYWRhMTJjOGRhNGRlOTg2NzY0M2I4M2FmZWQ2ZTQyYzEyMTQ2IiwiaWF0IjoxNjg5NDMxMTk0LCJuYmYiOjE2ODk0MzExOTQsImV4cCI6MTY4OTUxNzU5NCwic3ViIjoiODI5OTU3MCIsInNjb3BlcyI6W10sInVzZXIiOnsiaWQiOjgyOTk1NzAsImdyb3VwX2lkIjpudWxsLCJwYXJlbnRfaWQiOm51bGwsImNvbnRleHQiOnsiYWNjbGltIjoiMCJ9LCJhcmVhIjoibWVtYmVyIn19.bW_bfYpSTDzWWBQHLmfE1aTEQRmS8g8uo0f9m_kVl6DeQpNdkf--KRl1c50RL7kX896k1oJqMlwQ-5o5cGH_3ddG5lepzLlA_weAV-gQMDVevw9VY0x1Tf8dfZD6jbEY_NUmL675_hb_YRX4IYNlCKeEfogPMBwnS3WWYRkTkbwHxxiyGAnA1Dmi5H10FqE-5ZghDCStr6cZHSDY0iu6N6J9yoWIhge5IL0I_c3wO7bUi6I4CydoctqI5Dc8NmEOuCck8JBwg0M10LyX6q2SZMwta8yFYyKwM5xe7DjqD2OKKcjfvgXaJ5EvH6491GgFetSKF84Pk1GcCYhHfH3C0g")
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
      JsonNode jsonNode = null;
      try {
          jsonNode = objectMapper.readTree(responseBody);
      } catch (JsonProcessingException e) {
          throw new RuntimeException(e);
      }
      System.out.println("People reached!!!: " + jsonNode);
      // Получаем значение поля peopleReached из тела ответа
      int peopleReached = jsonNode.get("data").get("showScenarioStatisticsSum").get("edges").get(0).get("peopleReached").asInt();

      System.out.println("People reached: " + peopleReached);
      return (peopleReached);

  }

}


//
//      RestAssured.baseURI=BASE_URL;
//      given()
//              .header("Host", "login.sendpulse.com")
//              .header("content-type", "Application/json")
//              .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjJkOWNkZjFhMDFhYjQ1ZmRiNGY1MjNjYjdjOTUxYzA4YmE3ZjVjZDE1N2FmZWMwODQ3ZjkxNzdjMGMxMThlYjA0ODVjNzBiZDcwNmEzOTA4In0.eyJhdWQiOiJkNTZiYWVlNDczMWJhNzNjZjExOThkZGMwNzgwYjk4ZiIsImp0aSI6IjJkOWNkZjFhMDFhYjQ1ZmRiNGY1MjNjYjdjOTUxYzA4YmE3ZjVjZDE1N2FmZWMwODQ3ZjkxNzdjMGMxMThlYjA0ODVjNzBiZDcwNmEzOTA4IiwiaWF0IjoxNjg5MTk0ODE5LCJuYmYiOjE2ODkxOTQ4MTksImV4cCI6MTY4OTI4MTIxOSwic3ViIjoiODI5OTU3MCIsInNjb3BlcyI6W10sInVzZXIiOnsiaWQiOjgyOTk1NzAsImdyb3VwX2lkIjpudWxsLCJwYXJlbnRfaWQiOm51bGwsImNvbnRleHQiOnsiYWNjbGltIjoiMCJ9LCJhcmVhIjoibWVtYmVyIn19.drtLc2dmomyI7jE7ev-n7CGK-u4M6QwS_NCLWsxbJhpdHh5s7yRYR7qy4QzwVLTsGmyvAi-54quzCMQBPU3bmXc5igZNC8YWsDyIgo-BpHu8MZP13pjrcGjntdYUhYh88LtG0u5pgA3iBe6cwxxbYj98UQtL5OE2SkEBH9-pxVQaRkCiuZYgtBSCpg3d_ZdMNJVuhY4zp12FfTOhPaBQTK6GIEe_1n-pTarwv1f3xYSOB1gEy0HmWDUFg3rdgtvd62bW4Wlss6t0CcQAI1rSSI-Lvk87TqzynMqxhB14I28zvoED4sHsVGDuQKdq0RAeCjUUO6ms85Ye7ryXlHjSiA")
//              .body("{\"operationName\":\"showScenarioStatisticsSum\",\"variables\":{\"filter\":{\"scenarioId\":\"0aa2e798-ca4e-45d4-825f-ea89706e0e3e\"},\"locale\":\"ru\"},\"query\":\"query showScenarioStatisticsSum($first: Int, $offset: Int, $filter: ShowScenarioStatisticsSumFilterInterface, $locale: String) {\\n  showScenarioStatisticsSum(first: $first, offset: $offset, filter: $filter) {\\n    edges {\\n      peopleReached\\n      engagements\\n      startedDialogues\\n      formEngagements\\n      subscriptions\\n    }\\n    result(locale: $locale) {\\n      code\\n      errors {\\n        field\\n        message\\n      }\\n    }\\n  }\\n}\\n\"}")
//              .when()
//              .post("api/pop-ups/schema")
//              .then()
//              .body("data.showScenarioStatisticSum.edges[0]",equalTo(64));
