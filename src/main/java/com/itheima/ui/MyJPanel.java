package com.itheima.ui;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello World",250,250);
    }
}
