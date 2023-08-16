package api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreType
@Getter
@Setter
public class WatchesPojo {

    private String self;
    private int watchCount;
    private boolean isWatching;
}
