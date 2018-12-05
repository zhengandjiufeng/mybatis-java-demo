package com.bjhl.mybaits.study.demo3_annotation_dev;

import com.bjhl.mybaits.study.bean.User;
import com.bjhl.mybaits.study.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:54 AM
 * Description:
 * 测试内容说明
 * 1、注解开发开发 (不推荐)
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
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUser(2);
        System.out.println("注解模式：" + user);
    }

    /**
     * 新增-自动提交
     */
    private static void insert() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);

        User user = new User();
        user.setName("annotation");
        user.setIdNo(7000);
        user.setAge(20);

        int i = mapper.saveUser(user);
        System.out.println("注解模式：" + i);
    }

}
