package com.yle.mybatis.v1;

import com.yle.mybatis.beans.Test;

/**
 *
 */
public interface TestMapper {

    Test selectByPrimaryKey(Integer userId);

}
