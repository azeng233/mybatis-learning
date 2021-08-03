package cn.zengchen233.dao;

import cn.zengchen233.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //模糊查询
    List<User> getUserLike(String value);

    //获取全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //增加用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int delUser(int id);

    //测试万能的map
    int addUser2(Map<String, Object> map);
}
