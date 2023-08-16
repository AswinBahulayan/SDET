package api.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusPojo {

    private String self;
    private String description;
    private String iconUrl;
    private String name;
    private String id;
    private StatusCategoryPojo statusCategory;
}
