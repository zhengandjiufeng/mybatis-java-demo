package com.bjhl.mybaits.study.demo5_dynamic_sql;

import com.bjhl.mybaits.study.bean.User;
import com.bjhl.mybaits.study.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:54 AM
 * Description:
 * 测试内容说明
 * 1、动态sql 使用
 */
public class AppMain {

    public static void main(String[] args){

//        getUserById();
//        getUserByAgeRange();
//        getUserByNameNoSqlInject();
//        getUserByNameHasSqlInject();
//        getUserByIdsArray();
//        getUserByIdsList();
//        getUserByUsers();
//        getUserMap();
//        getUserCount();
        existUser();

    }

    private static void getUserById() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = userDao.getUserById(2);
        System.out.println("getUserById：" + user);
    }

    private static void getUserByAgeRange() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.getUserByAgeRange(17, 20);
        System.out.println("getUserByAgeRange：" + users);
    }

    private static void getUserByNameNoSqlInject() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.getUserByNameNoSqlInject("commit");
        System.out.println("getUserByNameNoSqlInject：" + users);
    }

    private static void getUserByNameHasSqlInject() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);

        // sql 注入
        String name = "'%%' or 1 = 1";
        /*
        mybatis sql 注入的问题是由于 $ 该符号直接输入变量值造成的
         */

        List<User> users = userDao.getUserByNameHasSqlInject(name);
        System.out.println("getUserByNameHasSqlInject：" + users);
    }

    private static void getUserByIdsArray() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);

        Integer ids [] = {2,3,4,5,8,9};
        List<User> users = userDao.getUserByIdsArray(ids);

        System.out.println("getUserByIdsArray：" + users);
    }

    private static void getUserByIdsList() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);

        List<String> ids = new ArrayList<>();
        ids.add("2");
        ids.add("3");
        ids.add("4");
        ids.add("5");
        ids.add("8");
        ids.add("9");

        List<User> users = userDao.getUserByIdsList(ids);

        System.out.println("getUserByIdsList：" + users);
    }

    private static void getUserByUsers() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);

        List<User> users = new ArrayList<>();
        users.add(new User(2,"zhangsan",1,1));
        users.add(new User(8,"zhangsan",1,1));
        users.add(new User(9,"zhangsan",1,1));

        List<User> res = userDao.getUserByUsers(users);

        System.out.println("getUserByUsers：" + res);

    }

    private static void getUserMap() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);

        Map<Integer, User> userMap = userDao.getUserMap();

        System.out.println("getUserMap:" + userMap);
    }

    private static void getUserCount() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        Integer count = userDao.getUserCount();
        System.out.printf("getUserCount:" + count);
    }

    private static void existUser() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        Integer userId = 20;
        Boolean isExist = userDao.existUser(userId);
        System.out.printf("existUser:" + isExist);
    }

}
