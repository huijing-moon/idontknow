package basic.Article.service;

import basic.Article.vo.ArticleVo;

import java.util.List;

public interface ArticleService {

    void create(ArticleVo articleVo) throws Exception;

    ArticleVo read(Integer articleNo) throws Exception;

    void update(ArticleVo articleVo) throws Exception;

    void delete(ArticleVo articleVo) throws Exception;

    List<ArticleVo> listAll() throws Exception;

}
