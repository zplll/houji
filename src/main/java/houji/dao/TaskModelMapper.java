package houji.dao;

import houji.bean.model.TaskModel;

import java.util.List;

public interface TaskModelMapper {
    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskModel record);

    int insertSelective(TaskModel record);

    TaskModel selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(TaskModel record);

    int updateByPrimaryKey(TaskModel record);

    List<TaskModel> selectByLeader(String leader);

    List<TaskModel> selectAll();
}