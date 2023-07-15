package Api;
import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;

public class ShowScenarioStatisticsSum {

  public int showStat(){


      String url = "https://login.sendpulse.com/api/pop-ups/schema"; // адрес API
      String requestBody = "{\"operationName\":\"showScenarioStatisticsSum\",\"variables\":{\"filter\":{\"scenarioId\":\"0aa2e798-ca4e-45d4-825f-ea89706e0e3e\"},\"locale\":\"ru\"},\"query\":\"query showScenarioStatisticsSum($first: Int, $offset: Int, $filter: ShowScenarioStatisticsSumFilterInterface, $locale: String) {\\n  showScenarioStatisticsSum(first: $first, offset: $offset, filter: $filter) {\\n    edges {\\n      peopleReached\\n      engagements\\n      startedDialogues\\n      formEngagements\\n      subscriptions\\n    }\\n    result(locale: $locale) {\\n      code\\n      errors {\\n        field\\n        message\\n      }\\n    }\\n  }\\n}\\n\"}"; // тело запроса в формате JSON
      String responseBody = given()
              .header("content-type", "Application/json")
              .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjMyYjZhM2FlN2ZkMzM5OGU1MWRkNDM2NmUwMTk4MjFiOTdiZDU0ZjFjYWViZDEzMzkwYjMzOTU1NDRjYTQyMTI4NTk5NDkzMDA1MmI1NDZmIn0.eyJhdWQiOiJkNTZiYWVlNDczMWJhNzNjZjExOThkZGMwNzgwYjk4ZiIsImp0aSI6IjMyYjZhM2FlN2ZkMzM5OGU1MWRkNDM2NmUwMTk4MjFiOTdiZDU0ZjFjYWViZDEzMzkwYjMzOTU1NDRjYTQyMTI4NTk5NDkzMDA1MmI1NDZmIiwiaWF0IjoxNjg5MzM3MjMyLCJuYmYiOjE2ODkzMzcyMzIsImV4cCI6MTY4OTQyMzYzMiwic3ViIjoiODI5OTU3MCIsInNjb3BlcyI6W10sInVzZXIiOnsiaWQiOjgyOTk1NzAsImdyb3VwX2lkIjpudWxsLCJwYXJlbnRfaWQiOm51bGwsImNvbnRleHQiOnsiYWNjbGltIjoiMCJ9LCJhcmVhIjoibWVtYmVyIn19.lQzvQ3NXAanNAGQ50m7a3vh82KL_L5Uv5JdV6U5dWiGdFc9h6eoKqKt2jyxBExkVpfkjuPsGXO2YeRABDpk177dQrEISbo7ArWiypCn2hNpe4U-WwEABslUmH7Vx8KdYl49SGXmRcaVtLqDc7kpinkVjHjgGv8pMzGSZwK0qlxNlxE7MUEOwMSEQo-6-WHsMZXi_ChW-qzUbBTrBQikGMWrz10mdckeZUh2fBBG7myfwxGA2cNy00GZf1QsAym4yMSYazrsBj_8Cud8BgX7b8CXx8ANpEmtw8OyA1mxtstBNXDtN6eeWzbsljYPGYH3c7E8toLaTMxHASNFC12KE0w")
//              .header("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjRiNGRhZDZhNzNmMDFhNGU5ZTBhMzUzYTJkMmY3OWZhYzA3ZmE2ZmY4MjM3OTg2YTc4YmE0MjQ3ODM2ZDY4ZTY2Mjk4NWJmY2Q1NDRiNGJmIn0.eyJhdWQiOiJkNTZiYWVlNDczMWJhNzNjZjExOThkZGMwNzgwYjk4ZiIsImp0aSI6IjRiNGRhZDZhNzNmMDFhNGU5ZTBhMzUzYTJkMmY3OWZhYzA3ZmE2ZmY4MjM3OTg2YTc4YmE0MjQ3ODM2ZDY4ZTY2Mjk4NWJmY2Q1NDRiNGJmIiwiaWF0IjoxNjg5MzM2OTI2LCJuYmYiOjE2ODkzMzY5MjYsImV4cCI6MTY4OTQyMzMyNiwic3ViIjoiODE4MTc1MSIsInNjb3BlcyI6W10sInVzZXIiOnsiaWQiOjgxODE3NTEsImdyb3VwX2lkIjpudWxsLCJwYXJlbnRfaWQiOm51bGwsImNvbnRleHQiOnsiYWNjbGltIjoiMCJ9LCJhcmVhIjoibWVtYmVyIn19.qrs_73kxOVCG8l2zUBFJ95pWlGK0Qxj1XlNDOQjG17MGyRxAlw9UD4CR_hZ04HyXdXWTzEtkYHglD5llv_kuUWawfG0LogcayAqHr7NMkb3bKrYANkf8Tb27fb2WpuSZIPmQqehTqQreQH8U9DrXKWNpLtp0OpahzDlka70GVYDcLf-RbNpQthHLkTjXb4LiYv9qWOJc96vk3FxrPnW4tk2VezbYN5kvcwxnNgKYfvJ3v_l-LMsFVPUJGqa-ybK_bkeQCl_lR610n3osn-YOhye5Rf3EfHxxB0zv8N_lNGYTl7RSZJ19mvtnkixRheX6ESGnAyVf-w_JcwdKYkwV_g")
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
