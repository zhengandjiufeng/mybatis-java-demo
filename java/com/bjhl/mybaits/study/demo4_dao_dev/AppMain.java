package com.bjhl.mybaits.study.demo4_dao_dev;

import com.bjhl.mybaits.study.bean.User;
import com.bjhl.mybaits.study.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:54 AM
 * Description:
 * 测试内容说明
 * 1、dao开发开发 (推荐)
 */
public class AppMain {

    public static void main(String[] args){

//        select();
        insert();
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

    /**
     * 新增-自动提交
     */
    private static void insert() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession(true);
        UserDao userDao = session.getMapper(UserDao.class);

        User user = new User();
        user.setName("dao");
        user.setIdNo(6000);
        user.setAge(20);

        int i = userDao.saveUser(user);
        System.out.println("dao模式：" + i);
    }

}
