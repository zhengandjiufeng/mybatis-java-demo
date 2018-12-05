package com.bjhl.mybaits.study.demo5_dynamic_sql;

import com.bjhl.mybaits.study.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 3:08 PM
 * Description:
 */
public interface UserDao {

    /**
     * 根据Id获取用户信息
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 根据age范围获取用户信息
     * @param minAge
     * @param maxAge
     * @return
     */
    List<User> getUserByAgeRange(@Param("minAge") int minAge,@Param("maxAge") int maxAge);

    /**
     * 根据name模糊查询
     * @param name
     * @return
     */
    List<User> getUserByNameNoSqlInject(@Param("name") String name);

    /**
     * 根据name模糊查询 ( sql 注入问题)
     * @param name
     * @return
     */
    List<User> getUserByNameHasSqlInject(@Param("name") String name);

    /**
     * 根据用户多id查询的用户信息
     * @param ids (类型-数组)
     * @return
     */
    List<User> getUserByIdsArray(@Param("ids") Integer ids []);

    /**
     * 根据用户多id查询的用户信息
     * @param ids (类型-集合)
     * @return
     */
    List<User> getUserByIdsList(@Param("ids") List<String> ids);

    /**
     * 根据多用户信息查询
     * @param users
     * @return
     */
    List<User> getUserByUsers(@Param("users") List<User> users);


}
