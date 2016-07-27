package com.assurance.dao;

import com.assurance.model.User;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;

/**
 * Author: yulongliu
 * Email:liuyulong04@meituan.com
 * Date:16/7/26
 * Time:下午4:03
 */
public class UserDAO {
    @Resource
    private SqlSession sqlSessionTemplate;

    public int insertUser(User userid) throws Exception {
        User user =new User();
        user.setState(111);
        user.setNickname("longlin");
        return sqlSessionTemplate.insert("UserDAO", userid);
    }


}
