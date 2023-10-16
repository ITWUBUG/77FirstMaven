package com.test;

import com.itheima.utils.ImageUtil;

import java.awt.image.BufferedImage;

public class Test {
    @org.junit.Test
    public void method(){
        BufferedImage bufferedImage = ImageUtil.readImg("D:\\1234\\0034034892281415_b.jpg");
        System.out.println(bufferedImage);
    }
}
