package houji.dao;

import houji.bean.model.TaskModel;

public interface TaskModelMapper {
    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskModel record);

    int insertSelective(TaskModel record);

    TaskModel selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(TaskModel record);

    int updateByPrimaryKey(TaskModel record);
}