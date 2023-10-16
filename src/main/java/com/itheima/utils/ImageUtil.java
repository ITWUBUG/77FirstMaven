package com.itheima.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class ImageUtil {
    private ImageUtil() {
    }

    /**
     * 读取图片
     * @param path 图片路径
     * @return 图片
     */
    public static BufferedImage readImg(String path){
        BufferedImage read = null;
        try (FileInputStream fileInputStream = new FileInputStream(path)){
             read = ImageIO.read(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return read;
    }
}
