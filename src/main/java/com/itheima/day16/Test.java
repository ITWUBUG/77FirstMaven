package com.itheima.day16;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student sda = new Student.StudentBuilder()
                .name("sda")
                .age(12).build();
    }
}
