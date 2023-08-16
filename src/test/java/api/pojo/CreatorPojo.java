package api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatorPojo {

    private String self;
    private String accountId;
    private String emailAddress;
    @JsonIgnore
    private AvatarUrlPojo avatarUrls;
    private String displayName;
    private boolean active;
    private String timeZone;
    private String accountType;

}
