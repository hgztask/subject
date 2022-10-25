package com.timu1;

public class Main {

    //定义一个Person类{name,age,job}，初始化Person对象数组，有三个person对象并按照age从大到小进行排序，使用冒泡排序。

    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person("小明", 17, "吃饭");
        arr[1] = new Person("小王", 18, "收租");
        arr[2] = new Person("小贵", 22, "老师");

        Person temp = arr[0];
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i].getAge() < arr[i + 1].getAge()) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            System.out.print(arr[i].getName() + "\t");
            System.out.print(arr[i].getAge() + "\t");
            System.out.print(arr[i].getJob());
            System.out.println();
        }


    }
}