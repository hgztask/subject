package com.timu2;

public class Lecturer extends  Teacher{
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("name=" + getName() + "\tage=" + getAge() + "\tpost=" + getPost() + "\tsalary=" + getSalary()*1.1);
    }
}
