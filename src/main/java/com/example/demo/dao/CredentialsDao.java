package com.example.demo.dao;

import com.example.demo.model.Credentials;
import org.springframework.stereotype.Repository;

/**
 * @author zhaobaolong
 * @Title: CredentialsDao
 * @ProjectName demo
 * @Description: TODO
 * @date 2019/6/2016:40
 */
@Repository
public interface CredentialsDao {
	Credentials findByUserName(String userName);
}
