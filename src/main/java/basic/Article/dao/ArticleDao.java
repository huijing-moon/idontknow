package basic.Article.dao;

import basic.Article.vo.ArticleVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDao {

    private static final String namespace = "articleVo";

    @Autowired
    SqlSession sql;

    public void create(ArticleVo articleVo) throws Exception{
        sql.insert(namespace+".create", articleVo);
    }

   public ArticleVo read(Integer articleNo) throws Exception{
        return sql.selectOne(namespace+".read", articleNo);
    }

    public void update(ArticleVo articleVo) throws Exception{
        sql.update(namespace+".update", articleVo);
    }

    public void delete(ArticleVo articleVo) throws Exception{
        sql.delete(namespace+".delete", articleVo);
    }

    public List<ArticleVo> listAll() throws Exception{
        return sql.selectList(namespace+".listAll");
    }
}
