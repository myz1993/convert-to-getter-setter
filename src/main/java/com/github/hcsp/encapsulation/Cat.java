package com.github.hcsp.encapsulation;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Cat {
    /** 猫咪的名字 */
    private  String name;
    /** 猫咪的年龄 */
    private  int age;
    /** 猫咪是否萌，true为萌，false为不萌 */
    private  boolean cute;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setCute(Boolean cute) {
        this.cute = cute;
    }

    public Boolean isCute(){
        return this.cute;
    }




}
