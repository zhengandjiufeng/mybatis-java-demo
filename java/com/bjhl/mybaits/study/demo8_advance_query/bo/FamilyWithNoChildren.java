package com.bjhl.mybaits.study.demo8_advance_query.bo;

import com.bjhl.mybaits.study.bean.Wife;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 7:05 PM
 * Description:
 * has be married ,but no children!
 */
public class FamilyWithNoChildren {

    /**
     * 主键Id
     */
    private Integer husbandId;

    /**
     * 男生名称
     */
    private String husbandName;

    /**
     * 妻子
     */
    private Wife wife;

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Integer getHusbandId() {
        return husbandId;
    }

    public void setHusbandId(Integer husbandId) {
        this.husbandId = husbandId;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    @Override
    public String toString() {
        return "FamilyWithNoChildren{" +
                "husbandId=" + husbandId +
                ", husbandName='" + husbandName + '\'' +
                ", wife=" + wife +
                '}';
    }
}
