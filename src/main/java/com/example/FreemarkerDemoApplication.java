package com.example;

import com.example.util.WordUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class FreemarkerDemoApplication {

    public static void main(String[] args) throws Exception{

        SpringApplication.run(FreemarkerDemoApplication.class, args);
        WordUtil.generateWord(getWordData(),"D:/Develop/IDEA/code_project/freemarkerDemo/src/main/resources/word/User.doc");
    }

    private static Map<String,Object> getWordData(){
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("name","用户1");
        dataMap.put("sex","男");
        dataMap.put("birthday","1991-01-01");
        return dataMap;
    }

}
