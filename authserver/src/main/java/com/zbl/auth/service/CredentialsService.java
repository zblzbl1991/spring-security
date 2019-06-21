package com.zbl.auth.service;

import com.zbl.auth.dao.CredentialsDao;
import com.zbl.auth.model.Authority;
import com.zbl.auth.model.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaobaolong
 * @Title: CredentialsService
 * @ProjectName demo
 * @Description:
 * @date 2019/6/2016:40
 */
@Service
public class CredentialsService {
	@Autowired
	private CredentialsDao credentialsDao;

	public Credentials findByUserName(String userName) {
		Credentials credentials = credentialsDao.findByUserName(userName);
		if (credentials == null) {
			return null;
		}
		List<Authority> authorityList = credentialsDao.findAuthoritiesByUserId(credentials.getId());
		credentials.setAuthorities(authorityList);
		return credentials;
	}
}
