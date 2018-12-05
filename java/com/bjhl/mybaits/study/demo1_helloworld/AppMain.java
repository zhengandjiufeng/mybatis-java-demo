package com.bjhl.mybaits.study.demo1_helloworld;

import com.bjhl.mybaits.study.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:54 AM
 * Description:
 */
public class AppMain {

    public static void main(String[] args) throws IOException {
//        insert();
//        delete();
//        update();
        select();

    }

    /**
     * 查询
     */
    private static void select() {
        String resource = "mybatis-config.xml";
        InputStream is = AppMain.class.getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = factory.openSession();

        String statement = "com.bjhl.mybaits.study.demo1_helloworld.UserMapper.getUser";

        User user = session.selectOne(statement, 2);
        System.out.println(user);
    }

    /**
     * 修改
     */
    private static void update() {
        String resource = "mybatis-config.xml";
        InputStream is = AppMain.class.getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = factory.openSession();

        String statement = "com.bjhl.mybaits.study.demo1_helloworld.UserMapper.getUser";

        User user = session.selectOne(statement, 2);
        System.out.println(user);
    }

    /**
     * 删除
     */
    private static void delete() {
        String resource = "mybatis-config.xml";
        InputStream is = AppMain.class.getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = factory.openSession();

        String statement = "com.bjhl.mybaits.study.demo1_helloworld.UserMapper.getUser";

        User user = session.selectOne(statement, 2);
        System.out.println(user);
    }

    /**
     * 新增
     */
    private static void insert() {
        String resource = "mybatis-config.xml";
        InputStream is = AppMain.class.getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = factory.openSession();

        String statement = "com.bjhl.mybaits.study.demo1_helloworld.UserMapper.getUser";

        User user = session.selectOne(statement, 2);
        System.out.println(user);
    }


}
