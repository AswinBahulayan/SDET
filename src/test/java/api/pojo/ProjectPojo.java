package api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectPojo {

    private String self;
    private String id;
    private String key;
    private String name;
    private String projectTypeKey;
    private String simplified;
    @JsonIgnore
    private AvatarUrlPojo avatarUrls;
}
