package com.yle.mybatis.v1;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: ms-mybatis
 * @description: 配置文件解析
 * @author: Mr.ZhangLing
 * @create: 2018-05-24 23:05
 **/
public class MSConfiguration {

    /**
     *
     * @param clazz
     * @param sqlSession
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> clazz, MSSqlSession sqlSession){
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new MSMapperProxy(sqlSession));
    }

    static class  TestMapperXml{

        public static final String namespace = "com.yle.mybatis.v1.TestMapper";

        public  static final Map<String, String> methodSqlMapping = new HashMap<String, String>();

        static {
            methodSqlMapping.put("selectByPrimaryKey", "select * from test where id = %d");
        }
    }

}
