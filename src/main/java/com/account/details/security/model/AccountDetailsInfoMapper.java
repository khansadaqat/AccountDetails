package com.account.details.security.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountDetailsInfoMapper implements RowMapper<AccountDetailsInfo>{

	/*
	 * @Override public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	 * User user = new User(); user.setId(rs.getLong("ID"));
	 * user.setUserName(rs.getString("USERNAME"));
	 * user.setPassword(rs.getString("PASSWORD"));
	 * user.setCreatedTime(rs.getDate("CREATEDTIME"));
	 * user.setUpdatedTime(rs.getDate("UPDATEDTIME"));
	 * user.setUserType(UserType.valueOf(rs.getString("USERTYPE")));
	 * user.setDateofBirth(rs.getDate("DATEOFBIRTH"));
	 * 
	 * return user; }
	 */

@Override
public AccountDetailsInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
	// TODO Auto-generated method stub
	AccountDetailsInfo accountDetailsInfo=new AccountDetailsInfo();
	accountDetailsInfo.setId(rs.getInt("ID"));
	accountDetailsInfo.setAcountType(rs.getString("amount"));
	
	return accountDetailsInfo;
}
}