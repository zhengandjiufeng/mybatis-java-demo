package com.bjhl.mybaits.study.demo8_advance_query;

import com.bjhl.mybaits.study.bean.Children;
import com.bjhl.mybaits.study.bean.Husband;
import com.bjhl.mybaits.study.bean.Wife;
import com.bjhl.mybaits.study.demo8_advance_query.bo.AppleOfMyEye;
import com.bjhl.mybaits.study.demo8_advance_query.bo.FamilyWithChildren;
import com.bjhl.mybaits.study.demo8_advance_query.bo.FamilyWithNoChildren;
import com.bjhl.mybaits.study.demo8_advance_query.dao.ChildrenDao;
import com.bjhl.mybaits.study.demo8_advance_query.dao.HusbandDao;
import com.bjhl.mybaits.study.demo8_advance_query.dao.WifeDao;
import com.bjhl.mybaits.study.util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

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

        /*
        // 简单查询
        getHusandById();
        getWifeById();
        getChildrenById();
        */

        /*
        // 高级查询
        */
        // 知识点 一对一关联查询
//        getAppleOfMyEyeByMethod();
        // 知识点 一对一关联查询
//        getFamilyWithNoChildren();

        // 知识点 一对多关联查询
        getFamilyWithChildren();

    }

    private static void getAppleOfMyEyeByMethod() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        HusbandDao husbandDao = session.getMapper(HusbandDao.class);

        Integer husbandId = 2;
        // 方式1
//        AppleOfMyEye appleOfMyEye = husbandDao.getAppleOfMyEyeByMethodByHusBandMethod1(husbandId);
        // 方式2
        AppleOfMyEye appleOfMyEye = husbandDao.getAppleOfMyEyeByMethodByHusBandMethod2(husbandId);

        System.out.println("getAppleOfMyEyeByMethod：" + appleOfMyEye);
    }

    private static void getFamilyWithNoChildren() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        HusbandDao husbandDao = session.getMapper(HusbandDao.class);

        Integer husbandId = 3;
        // 方式1
//        FamilyWithNoChildren familyWithNoChildren = husbandDao.getFamilyWithNoChildrenByMethodByHusBandMethod1(husbandId);
        FamilyWithNoChildren familyWithNoChildren = husbandDao.getFamilyWithNoChildrenByMethodByHusBandMethod2(husbandId);

        System.out.println("getFamilyWithNoChildren：" + familyWithNoChildren);
    }

    private static void getFamilyWithChildren() {

        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        HusbandDao husbandDao = session.getMapper(HusbandDao.class);

        Integer husbandId = 2;
        // 方式1
//        FamilyWithChildren familyWithChildren = husbandDao.getFamilyWithChildrenByMethodByHusBandMethod1(husbandId);
        // 方式2
        FamilyWithChildren familyWithChildren = husbandDao.getFamilyWithChildrenByMethodByHusBandMethod2(husbandId);
        System.out.println("getFamilyWithChildren：" + familyWithChildren);
    }

    private static void getHusandById() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        HusbandDao husbandDao = session.getMapper(HusbandDao.class);
        Husband husband = husbandDao.getById(1);
        System.out.println("getHusandById：" + husband);
    }

    private static void getWifeById() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        WifeDao wifeDao = session.getMapper(WifeDao.class);
        Wife wife = wifeDao.getById(1);
        System.out.println("getWifeById：" + wife);
    }

    private static void getChildrenById() {
        SqlSession session = SessionFactoryUtil.getFactory().openSession();
        ChildrenDao childrenDao = session.getMapper(ChildrenDao.class);
        Children children = childrenDao.getById(1);
        System.out.println("getChildrenById：" + children);
    }
}
