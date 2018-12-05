package com.bjhl.mybaits.study.bean;

/**
 * @author: zhengzhixiong@baijiahulian.com
 * @date: 2018/12/5
 * @time: 11:56 AM
 * Description:
 */
public class User{

    private int id;
    private String name;
    private int age;
    private int idNo;

    public User(int id, String name, int age, int idNo) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.idNo = idNo;
    }
    public User() {
        super();
    }
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", idNo=" + idNo +
                '}';
    }
}
