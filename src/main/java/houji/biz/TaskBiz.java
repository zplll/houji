package houji.biz;

import houji.bean.model.TaskModel;
import houji.dao.BaseOperator;
import houji.dao.TaskModelMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by ziponlll on 2017/6/10.
 */
public class TaskBiz {

    SqlSessionFactory sqlSessionFactory = BaseOperator.ssf;
    SqlSession ss = sqlSessionFactory.openSession();

    TaskModelMapper itmm = ss.getMapper(TaskModelMapper.class);

    public void insertTask(TaskModel taskmodel){
        try{
        itmm.insert(taskmodel);}
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
