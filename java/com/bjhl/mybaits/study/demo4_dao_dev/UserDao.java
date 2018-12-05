package com.bjhl.mybaits.study.demo4_dao_dev;

import com.bjhl.mybaits.study.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 3:08 PM
 * Description:
 */
public interface UserDao {

    int saveUser(User user);

    int deleteByUserId(int id);

    int updateUser(User user);

    User getUser(int id);

    List<User> getAll();

}
