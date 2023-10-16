package com.itheima.ui;

import com.itheima.utils.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyJPanel extends JPanel {
    public MyJPanel() {
        //取消居中默认布局
        super.setLayout(null);
        JLabel jLabel = new JLabel();
        jLabel.setText("用户名");
        jLabel.setFont(new Font("宋体", Font.PLAIN, 20));
        //默认布局居中不取消默认布局不会生效
        jLabel.setBounds(20,20,100,30);
        this.add(jLabel);
        //单行文本框
        JTextField jTextField = new JTextField("请输入用户名");
        jTextField.setBounds(90,20,130,30);
        //设置是否可以鱿编辑
//        jTextField.setEditable(false);
        this.add(jTextField);


    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //设置颜色和格式
//        g.setColor(Color.GREEN);
//        Font font = new Font("宋体", Font.ITALIC, 30);
//        g.setFont(font);
//        g.drawString("Hello World", 250, 250);
//        g.drawString("哈哈哈", 10, 250);
//        g.setColor(Color.RED);
//        //画线
//        g.drawLine(20,30,200,200);
//        //画圆
//        g.drawOval(10, 10, 100, 100);
//        //画矩形
//        g.drawRect(200,200,100,120);
        //画图片
//        BufferedImage bufferedImage = ImageUtil.readImg("D:\\1234\\0034034892281415_b.jpg");
//        g.drawImage(bufferedImage,0,0,1000,500,null);

    }
}
