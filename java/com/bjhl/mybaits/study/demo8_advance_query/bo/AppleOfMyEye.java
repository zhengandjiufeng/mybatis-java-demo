package com.bjhl.mybaits.study.demo8_advance_query.bo;

import com.bjhl.mybaits.study.bean.Wife;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 7:07 PM
 * Description:
 * 热恋时期，your are the apple of my eye .
 */
public class AppleOfMyEye {

    /**
     * 主键Id
     */
    private Integer boyId;

    /**
     * 男生名称
     */
    private String boyName;

    /**
     * 还未结婚，已然当做是未来老婆了
     */
    private Wife wife;

    public Integer getBoyId() {
        return boyId;
    }

    public void setBoyId(Integer boyId) {
        this.boyId = boyId;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "AppleOfMyEye{" +
                "boyId=" + boyId +
                ", boyName='" + boyName + '\'' +
                ", wife=" + wife +
                '}';
    }
}
