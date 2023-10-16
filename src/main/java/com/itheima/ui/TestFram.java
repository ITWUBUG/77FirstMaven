package com.itheima.ui;

public class TestFram {
    public static void main(String[] args) {
        MyJfram jfram = new MyJfram("第一个窗体");

        MyJPanel myJPanel = new MyJPanel();
        jfram.add(myJPanel);

        //设置窗体可见
        jfram.setVisible(true);

    }
}
