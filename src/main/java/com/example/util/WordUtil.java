package com.example.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;


import java.io.*;
import java.util.Map;

public class WordUtil {

    /**
     * 使用freemarker自动生成word文档
     * @param dataMap   生成word文档所需要的数据
     * @param fileName  生成word文档的全路径名称
     */
    public static void generateWord(Map<String,Object> dataMap,String fileName)throws Exception{
        //设置freemarker的版本和编码格式
        Configuration configuration = new Configuration(new Version("2.3.28"));
        configuration.setDefaultEncoding("UTF-8");

        //设置模板路径
        configuration.setDirectoryForTemplateLoading(new File("D:/Develop/IDEA/code_project/freemarkerDemo/src/main/resources/word"));
        Template template = configuration.getTemplate("WordTemplate.ftl", "UTF-8");
        //创建一个word文档输出流
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(fileName)), "UTF-8"));
        template.process(dataMap,out);
        out.flush();
        out.close();
    }
}
