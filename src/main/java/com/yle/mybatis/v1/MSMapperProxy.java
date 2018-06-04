package com.yle.mybatis.v1;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: ms-mybatis
 * @description: 配置文件解析
 * @author: Mr.ZhangLing
 * @create: 2018-05-24 23:05
 **/
public class MSMapperProxy implements InvocationHandler {

    private MSSqlSession sqlSession;

    public MSMapperProxy(MSSqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getDeclaringClass().getName().equals(MSConfiguration.TestMapperXml.namespace)){
           String sql =  MSConfiguration.TestMapperXml.methodSqlMapping.get(method.getName());
            return sqlSession.selectOne(sql, String.valueOf(args[0]));
        }

        return method.invoke(this, args);
    }
}
