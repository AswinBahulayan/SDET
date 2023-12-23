package api.cowinpojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.restassured.RestAssured;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class States {

    @JsonProperty("state_id")
    private int state_id;
    @JsonProperty("state_name")
    private Object stateName;

}
