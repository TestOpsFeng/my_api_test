package top.testops.my_api_test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.testops.my_api_test.dao.been.DataBeen;
import top.testops.my_api_test.dao.been.UIDataBeen;

/**
  * @ClassName LoginDao
  * @Description TODO
  * @author carson
  * @date 2020/3/13
**/
@Mapper
@Repository
public interface AppDao {
    DataBeen findByTag(String tag);

    UIDataBeen findUIByTag(String tag);
}
