package com.bjhl.mybaits.study.demo9_1_cache_local;

import com.bjhl.mybaits.study.bean.User;

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

}
