package com.yle.mybatis.v1;

import com.yle.mybatis.beans.Test;

/**
 * @program: ms-mybatis
 * @description: mybatis_v1 Test
 * @author: Mr.ZhangLing
 * @create: 2018-05-24 23:38
 **/
public class Entry {

    public static void main(String[] args){

        MSSqlSession sqlSession =  new MSSqlSession(new MSConfiguration(), new MSSimpleExecutor());

        TestMapper mapper = sqlSession.getMapper(TestMapper.class);

        Test test = mapper.selectByPrimaryKey(1);

        System.out.print(test);
    }

}
