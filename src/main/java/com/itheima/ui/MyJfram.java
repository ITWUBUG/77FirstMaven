package com.itheima.ui;

import com.itheima.utils.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyJfram extends JFrame {

    public MyJfram(String title) throws HeadlessException {
        super(title);
        //设置宽高
        super.setSize(1000, 500);
        BufferedImage bufferedImage = ImageUtil.readImg("D:\\1234\\下载.ico");
        super.setIconImage(bufferedImage);
    }
}
