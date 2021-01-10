package com.swenjie.dao;

import com.swenjie.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by swenjie
 */
public interface AccountDao  extends JpaRepository<Account,Integer> {
}
