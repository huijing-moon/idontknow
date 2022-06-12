package basic.Article.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleVo {
    private Integer articleNo;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private int viewcnt;
}
