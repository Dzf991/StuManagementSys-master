package com.syxy.stumangementsys.mapper;

import com.syxy.stumangementsys.entities.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    Account getAccount(Account account);
}
