package com.github.hcsp.encapsulation;

public class Cat {

    private String name;

    private int age;

    private boolean cute;

    /** 猫咪的名字 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** 猫咪的年龄 */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /** 猫咪是否萌，true为萌，false为不萌 */
    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }
}
