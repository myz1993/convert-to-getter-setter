package com.github.hcsp.encapsulation;

public class Cat {
    /** 猫咪的名字 */
    private String name = "Tom";
    /** 猫咪的年龄 */
    private int age = 0;
    /** 猫咪是否萌，true为萌，false为不萌 */
    private boolean cute = false;

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

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.isCute());
    }
}
