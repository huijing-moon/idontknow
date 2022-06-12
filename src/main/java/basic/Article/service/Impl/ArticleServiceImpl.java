package basic.Article.service.Impl;

import basic.Article.dao.ArticleDao;
import basic.Article.service.ArticleService;
import basic.Article.vo.ArticleVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleDao articleDao;

    public ArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }


    @Override
    public void create(ArticleVo articleVo) throws Exception {
        articleDao.create(articleVo);
    }

    @Override
    public ArticleVo read(Integer articleNo) throws Exception {
       return articleDao.read(articleNo);
    }

    @Override
    public void update(ArticleVo articleVo) throws Exception {
        articleDao.update(articleVo);
    }

    @Override
    public void delete(ArticleVo articleVo) throws Exception {
        articleDao.delete(articleVo);
    }

    @Override
    public List<ArticleVo> listAll() throws Exception {
        return articleDao.listAll();
    }
}
