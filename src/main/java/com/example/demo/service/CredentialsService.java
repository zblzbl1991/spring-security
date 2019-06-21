package com.example.demo.service;

import com.example.demo.dao.CredentialsDao;
import com.example.demo.model.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return credentialsDao.findByUserName(userName);
	}
}
