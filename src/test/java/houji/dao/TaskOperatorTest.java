package houji.dao;

import houji.bean.Task;
import houji.bean.model.TaskModel;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by zipon on 2017/3/12.
 */
public class TaskOperatorTest {
    @Test
    public void testSelectTasksByLeader() throws Exception {
        List<TaskModel> tasks = TaskOperator.getInstance().selectTasksByLeader("陈丽莉");
        System.out.println(tasks);
    }

}