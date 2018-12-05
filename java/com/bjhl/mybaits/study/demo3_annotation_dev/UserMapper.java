package com.bjhl.mybaits.study.demo3_annotation_dev;

import com.bjhl.mybaits.study.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 3:08 PM
 * Description:
 */
public interface UserMapper {

    @Insert("INSERT INTO `t_mybatis_user` (`name`, `id_no`, `age`) VALUES ( #{name}, #{idNo}, #{age})")
    int saveUser(User user);

    @Delete("delete from `t_mybatis_user` where id=#{id}")
    int deleteByUserId(int id);

    @Update("upupdate t_mybatis_user set name = #{name}, age = #{age}, id_no = #{idNo} where id=#{id}")
    int updateUser(User user);

    @Select("select * from t_mybatis_user where id=#{id}")
    User getUser(int id);

    @Select("select * from t_mybatis_user")
    List<User> getAll();

}
