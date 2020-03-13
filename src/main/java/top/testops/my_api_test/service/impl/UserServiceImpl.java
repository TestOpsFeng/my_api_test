package top.testops.my_api_test.service.impl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.testops.my_api_test.dao.UserDao;
import top.testops.my_api_test.dao.been.UserBeen;
import top.testops.my_api_test.service.UserService;

import java.util.List;

/**
  * @ClassName UserServiceImpl
  * @Description TODO
  * @author carson
  * @date 2020/3/12
**/
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;

    @Override
    public void findUser() {
        List<UserBeen> all = userDao.findAll();
        for (UserBeen userBeen : all) {
            log.error("ALL:" + userBeen.getName());
        }

        UserBeen byId = userDao.findById(1);
        System.out.println("byID: " + byId.getName());
    }


    @Override
    public void save() {
        userDao.save("Test");
    }
}
