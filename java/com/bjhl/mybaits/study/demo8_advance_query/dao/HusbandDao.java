package com.bjhl.mybaits.study.demo8_advance_query.dao;

import com.bjhl.mybaits.study.bean.Husband;
import com.bjhl.mybaits.study.demo8_advance_query.bo.AppleOfMyEye;
import com.bjhl.mybaits.study.demo8_advance_query.bo.FamilyWithChildren;
import com.bjhl.mybaits.study.demo8_advance_query.bo.FamilyWithNoChildren;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 7:16 PM
 * Description:
 */
public interface HusbandDao {

    Husband getById(Integer id);

    /**
     * 根据husbandId 查询女票信息 方式1
     * @param husbandId
     * @return
     */
    AppleOfMyEye getAppleOfMyEyeByMethodByHusBandMethod1(Integer husbandId);

    /**
     * 根据husbandId 查询女票信息 方式2
     * @param husbandId
     * @return
     */
    AppleOfMyEye getAppleOfMyEyeByMethodByHusBandMethod2(Integer husbandId);

    /**
     * 根据husbandId 查询老婆信息 方式1
     * @param husbandId
     * @return
     */
    FamilyWithNoChildren getFamilyWithNoChildrenByMethodByHusBandMethod1(Integer husbandId);

    /**
     * 根据husbandId 查询老婆信息 方式2
     * @param husbandId
     * @return
     */
    FamilyWithNoChildren getFamilyWithNoChildrenByMethodByHusBandMethod2(Integer husbandId);

    /**
     * 根据husbandId 查询老婆、孩子信息 方式1
     * @param husbandId
     * @return
     */
    FamilyWithChildren getFamilyWithChildrenByMethodByHusBandMethod1(Integer husbandId);

    /**
     * 根据husbandId 查询老婆、孩子信息 方式2
     * @param husbandId
     * @return
     */
    FamilyWithChildren getFamilyWithChildrenByMethodByHusBandMethod2(Integer husbandId);


}
