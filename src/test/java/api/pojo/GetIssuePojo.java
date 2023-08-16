package api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetIssuePojo {


    private Object expand;
    private String id;
    private String self;
    private String key;
    private FieldsPojo fields;

}
