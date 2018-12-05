package com.bjhl.mybaits.study.demo8_advance_query.bo;

import com.bjhl.mybaits.study.bean.Children;
import com.bjhl.mybaits.study.bean.Husband;
import com.bjhl.mybaits.study.bean.Wife;

import java.util.List;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 7:05 PM
 * Description:
 * has be married with children
 */
public class FamilyWithChildren {

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

    /**
     * 孩子
     */
    private List<Children> children ;

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

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "FamilyWithChildren{" +
                "husbandId=" + husbandId +
                ", husbandName='" + husbandName + '\'' +
                ", wife=" + wife +
                ", children=" + children +
                '}';
    }
}
