package com.bjhl.mybaits.study.bean;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:56 AM
 * Description:
 */
public class Wife {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
