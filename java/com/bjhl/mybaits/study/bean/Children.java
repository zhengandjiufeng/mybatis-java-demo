package com.bjhl.mybaits.study.bean;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:56 AM
 * Description:
 */
public class Children {

    private Integer id;
    /**
     * 姓名
     */
    private String name;

    /**
     * 别名
     */
    private String alias;


    /**
     * 性别
     */
    private Integer sex;

    /**
     * 父亲
     */
    private Integer fatherId;

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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    @Override
    public String toString() {
        return "Children{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", sex=" + sex +
                ", fatherId=" + fatherId +
                '}';
    }
}
