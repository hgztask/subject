package com.timu1;

public class Person {
    //名字
    private String name;
    //年龄
    private int age;
    //工作
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    //冒泡排序
    public  void bubbleSort(int[] arr){
        int temp = arr[0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    //冒泡排序
    public  void bubbleSort(Person[] arr){

    }
}
