package basic.todo.VO;

import lombok.Data;

@Data
public class todoVO {
    public Integer idx;
    public String contents;
    public String completeYn;
    private String userId;


}
