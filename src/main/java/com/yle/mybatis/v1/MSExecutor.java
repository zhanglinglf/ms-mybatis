package com.yle.mybatis.v1;

public interface MSExecutor {

    public <T> T query (String statement, String parameter);

}
