package com.bjhl.mybaits.study.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 2:52 PM
 * Description:
 */
public class SessionFactoryUtil {

    public static SqlSessionFactory getFactory() {

        String resource = "mybatis-config.xml";
        InputStream is = SessionFactoryUtil.class.getClassLoader().getResourceAsStream(
                resource);

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        return factory;
    }
}
