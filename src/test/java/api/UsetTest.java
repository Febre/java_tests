package api;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class UsetTest {

    @Test
    public void checkUser() {
        when()
                .get("https://swapi.co/api/planets/1/")
                .then()
                .body("$.residents[1]", equalTo("https://swapi.co/api/people/2/"));

    }

}
