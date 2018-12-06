package com.bjhl.mybaits.study.demo6_config;

import com.bjhl.mybaits.study.bean.User;
import com.bjhl.mybaits.study.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:54 AM
 * Description:
 * 测试内容说明
 * 1、settings mapUnderscoreToCamelCase 参数意义
 */
public class AppMain {

    public static void main(String[] args){

        /**
         * checkout idNo's output value of user is right ?
         */
        select();
    }

    /**
     * 查询
     */
    private static void select() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = userDao.getUser(2);
        System.out.println("dao模式：" + user);
    }

}
