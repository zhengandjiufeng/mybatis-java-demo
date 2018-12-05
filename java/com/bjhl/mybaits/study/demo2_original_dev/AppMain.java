package com.bjhl.mybaits.study.demo2_original_dev;

import com.bjhl.mybaits.study.bean.User;
import com.bjhl.mybaits.study.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:54 AM
 * Description:
 * 测试内容说明
 * 1、原始模式开发 （不推荐）
 * 2、获取主键方式
 *
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
        String statement = "com.bjhl.mybaits.study.demo2_original_dev.UserMapper.getUser";
        User user = session.selectOne(statement, 2);
        System.out.println(user);
    }

    /**
     * 新增-手动提交（默认）/ 自动提交
     */
    private static void insert() {

        // 手动提交
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        String statement = "com.bjhl.mybaits.study.demo2_original_dev.UserMapper.saveUser";
        User user = new User();
        user.setName("manual_commit");
        user.setIdNo(8000);
        user.setAge(24);
        int insert = session.insert(statement, user);
        session.commit();
        System.out.println("insert res :" + insert);
        System.out.println("user: " + user);

        /*
        // 自动提交
        SqlSession session = SessionFactoryUtil.getFactory().openSession(true);
        String statement = "com.bjhl.mybaits.study.demo2_original_dev.UserMapper.saveUser";
        User user = new User();
        user.setName("auto_commit");
        user.setIdNo(9000);
        user.setAge(10);
        int insert = session.insert(statement, user);
        System.out.println("insert res :" + insert);
        */
    }



}
