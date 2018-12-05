package com.bjhl.mybaits.study.bean;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:56 AM
 * Description:
 */
public class Husband {
    private Integer id;
    private String name;
    private Integer wifeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWifeId() {
        return wifeId;
    }

    public void setWifeId(Integer wifeId) {
        this.wifeId = wifeId;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wifeId=" + wifeId +
                '}';
    }
}
