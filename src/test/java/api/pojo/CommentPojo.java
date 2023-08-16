package api.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentPojo {

    private CommentsPojo[] comments;
    private String self;
    private int maxResults;
    private int total;
    private int startAt;
}
