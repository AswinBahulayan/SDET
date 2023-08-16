package api.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTypePojo {

    private String self;
    private String id;
    private String description;
    private String iconUrl;
    private String name;
    private String subtask;
    private String avatarId;
    private String hierarchyLevel;
}
