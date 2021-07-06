package com.configurationOriented;

import java.io.IOException;
import java.util.Properties;
/**
 * 面向配置的思想
 * 将key-values形式的配置信息写到属性文件xxx.properties里，修改的时候只需要修改properties文件
 */

public class Test {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        //加载configurationOriented下的jdbc.properties:
        //写法一：相对路径，以calss文件于properties文件在同一个文件夹下为例
        //p.load(Test.class.getResourceAsStream("jdbc.properties"));
        //写法二：绝对路径，系统以src作为根目录
        p.load(Test.class.getResourceAsStream("/com/configurationOriented/jdbc.properties"));
        String url = p.getProperty("jdbcurl");
        System.out.println(url);
    }
}
