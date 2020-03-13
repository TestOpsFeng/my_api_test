package top.testops.my_api_test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import top.testops.my_api_test.dao.been.UserBeen;

import javax.annotation.Resource;
import java.util.List;

/**
  * @ClassName UserDao
  * @Description TODO
  * @author carson
  * @date 2020/3/12
**/

@Mapper
public interface UserDao {

    List<UserBeen> findAll();

    UserBeen findById(int id);

    void save(String name);
}
