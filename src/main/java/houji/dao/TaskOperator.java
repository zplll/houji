package houji.dao;

import houji.bean.Task;
import houji.bean.model.TaskModel;
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

    public List<TaskModel> selectTasksByLeader(String leader){
        SqlSession ss = ssf.openSession();
        List<TaskModel>  tasks = new ArrayList<TaskModel>();
        try {
            TaskModelMapper taskModelMapper=ss.getMapper(TaskModelMapper.class);
            tasks =taskModelMapper.selectByLeader(leader); //ss.selectList("houji.mapper.Task.selectTasksByLeader", leader);
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            ss.close();
        }
        return  tasks;
    }
    public List<TaskModel> selectAll(){
        SqlSession ss = ssf.openSession();
        List<TaskModel>  tasks = new ArrayList<TaskModel>();
        try {
            TaskModelMapper taskModelMapper=ss.getMapper(TaskModelMapper.class);
            tasks =taskModelMapper.selectAll(); //ss.selectList("houji.mapper.Task.selectTasksByLeader", leader);
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            ss.close();
        }
        return  tasks;
    }
}
