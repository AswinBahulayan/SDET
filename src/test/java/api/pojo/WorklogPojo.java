package api.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorklogPojo {

    private int startAt;
    private int maxResults;
    private int total;
    private WorkLogsPojo[] worklogs;

}
