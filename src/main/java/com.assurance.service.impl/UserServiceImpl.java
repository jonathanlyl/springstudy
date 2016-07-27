package com.assurance.service.impl;




import com.assurance.dao.UserDAO;
import com.assurance.service.UserService;
import com.assurance.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: yulongliu
 * Email:liuyulong04@meituan.com
 * Date:16/7/26
 * Time:下午4:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public int insertUser(User user) {
        try {
            return userDAO.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }  return 0;
    }


}
