package com.bjhl.mybaits.study.demo9_2_cache_distribute_redis;

import com.bjhl.mybaits.study.bean.User;
import com.bjhl.mybaits.study.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:54 AM
 * Description:
 * 1. 一级缓存 : session级的缓存
 *  1. 执行了session.clearCache();
 *  2. 执行CUD操作
 *  3. 不是同一个Session对象
 * 2. 二级缓存: 是一个映射文件级(mappper级)的缓存
 */
public class AppMain {

    public static void main(String[] args){
//        testOneLevelCache();
        testTwoLevelCache();
    }

    /**
     * 测试二级缓存
     * 注意1：在userMapper.xml 打开 cache 代码
     * 注意2：二级缓存，User对象一定要实现序列化接口
     * 注意3：看日志打印，Cache Hit Ratio [com.bjhl.mybaits.study.demo9_1_cache_local.UserDao]: 0.5 （命中率50%）
     * 注意4：看redis 信息
     * 127.0.0.1:6379> keys *
     * 1) "rank"
     * 2) "com.bjhl.mybaits.study.demo9_2_cache_distribute_redis.UserDao"
     * 3) "test"
     * 127.0.0.1:6379>
     */
    private static void testTwoLevelCache() {
        SqlSessionFactory factory = SessionFactoryUtil.getFactory();
        SqlSession session1 = factory.openSession();
        SqlSession session2 = factory.openSession();

        /*
        // 错误做法，这样永远都不会拿到二级缓存，由于SessionFactoryUtil.getFactory()产生的都是新对象
        SqlSession session1 = SessionFactoryUtil.getFactory().openSession();
        SqlSession session2 = SessionFactoryUtil.getFactory().openSession();
        */
        if (session1 == session2) {
            System.out.println("same session!");
        }else{
            System.out.println("different session!");
        }

        long start = System.currentTimeMillis();
        String statement = "com.bjhl.mybaits.study.demo9_2_cache_distribute_redis.UserDao.getUser";
        User user = session1.selectOne(statement, 2);
        System.out.println("two level cache , session1:" + user);
        session1.close();

        System.out.println("-------------------------------------------------------------");

        user = session2.selectOne(statement, 2);
        System.out.println("two level cache , session2:" + user);

        long end = System.currentTimeMillis();
        System.out.println("end - start = " + (end - start));
    }

}
