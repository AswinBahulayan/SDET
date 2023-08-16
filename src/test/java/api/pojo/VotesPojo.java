package api.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotesPojo {

    private String self;
    private int votes;
    private boolean hasVoted;
}
