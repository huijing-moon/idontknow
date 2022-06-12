package basic.todo.Dao;

import basic.todo.VO.todoVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class todoDao {

    @Autowired
    private SqlSessionTemplate sql;


    private String namespace= "mapper.todo";


//    public List<todoVO> getAllList(todoVO vo) throws Exception {
//        return sql.selectList(namespace+"getAllList" ,vo);
//    }


}
