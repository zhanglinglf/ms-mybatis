package com.yle.mybatis.v1;

public class MSSqlSession {

    private MSConfiguration configuration;

    private  MSExecutor executor;

    public MSSqlSession(MSConfiguration configuration, MSExecutor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    /**
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> clazz){
        return configuration.getMapper(clazz, this);
    }

    /**
     *
     * @param statement
     * @param paramter
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statement, String paramter){
        return executor.query(statement, paramter);
    }


}
