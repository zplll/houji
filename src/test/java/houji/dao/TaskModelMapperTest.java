package houji.dao;

import houji.bean.model.TaskModel;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by ziponlll on 2017/6/4.
 */
public class TaskModelMapperTest {
    @Test
    public void testSelectByPrimaryKey() throws Exception {

        SqlSessionFactory sqlSessionFactory = BaseOperator.ssf;
        SqlSession ss = sqlSessionFactory.openSession();

        TaskModelMapper itmm = ss.getMapper(TaskModelMapper.class);
        TaskModel tm=itmm.selectByPrimaryKey(1);
        System.out.println(tm.toString());
        ss.close();
    }
    @Test
    public void testUpdateByPrimaryKey() throws Exception {

        SqlSessionFactory sqlSessionFactory = BaseOperator.ssf;
        SqlSession ss = sqlSessionFactory.openSession();
        TaskModel taskModel = new TaskModel();
        taskModel.setBvcPrice(89);
        taskModel.setTaskId(1);

        TaskModelMapper itmm = ss.getMapper(TaskModelMapper.class);
        int result=itmm.updateByPrimaryKeySelective(taskModel);
        System.out.println(result);
        ss.commit();
        ss.close();
    }

}