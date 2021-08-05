package com.account.details.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.account.details.security.model.AccountDetailsInfo;
import com.account.details.security.model.AccountDetailsInfoMapper;
@Service
@Transactional
public class AccountDetailsServicImpl implements AccountDetailsService {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<AccountDetailsInfo> getAccountDetails() {
		// TODO Auto-generated method stub
		String s="Select * from account"; 
		//jdbcTemplate.query(s, new ResultSetExtractor<Acount> )
		AccountDetailsInfoMapper accountDetailsInfoMapper=new AccountDetailsInfoMapper();
		jdbcTemplate.query(s, accountDetailsInfoMapper );
		
		return null;
		 }

}
