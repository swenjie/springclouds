package com.swenjie.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by swenjie
 */
public interface AccountMapper2 {
   int update( @Param("money") double money, @Param("id") int  id);
}
