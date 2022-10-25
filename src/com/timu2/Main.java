package com.timu2;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Professor("王老师", 32, "教授", 3200);
        teacher.introduce();
        teacher = new AssociateProfessor("陈老师", 19, "副教授", 1500);
        teacher.introduce();
        teacher = new Lecturer("桂老师", 25, "讲师", 1000);
        teacher.introduce();

    }
}
