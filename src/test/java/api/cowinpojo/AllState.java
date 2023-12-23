package api.cowinpojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.junit.Test;

@Data
public class AllState {

    @JsonProperty("states")
    private States[] state;

    @JsonProperty("ttl")
    private int ttl;
}
