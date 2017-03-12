package houji.dao;

import houji.bean.Task;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zipon on 2017/3/12.
 */
public class TaskOperator extends BaseOperator {
    private static TaskOperator instance = new TaskOperator();
    private TaskOperator(){

    }
    public static TaskOperator getInstance(){
        return  instance;
    }

    public List<Task> selectTasksByLeader(String leader){
        SqlSession ss = ssf.openSession();
        List<Task>  tasks = new ArrayList<Task>();
        try {
            tasks = ss.selectList("houji.mapper.Task.selectTasksByLeader", leader);
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            ss.close();
        }
        return  tasks;
    }
}
