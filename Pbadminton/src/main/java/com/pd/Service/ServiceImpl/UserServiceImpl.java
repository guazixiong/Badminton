package com.pd.Service.ServiceImpl;

import com.pd.Dao.UserDao;
import com.pd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    //注册
    public String register(String uname) {
        if (uname.equals(" "))
            return "请确认所输入的信息是否符合格式要求";
        else {
            userDao.register(uname);
            return "添加成功";
        }
    }
}
