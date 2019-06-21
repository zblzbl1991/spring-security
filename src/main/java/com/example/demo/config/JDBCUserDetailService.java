package com.example.demo.config;

import com.example.demo.model.Credentials;
import com.example.demo.service.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author zhaobaolong
 * @Title: JDBCUserDetailService
 * @ProjectName demo
 * @Description: 数据库获取用户信息Service实现类
 * @date 2019/6/2015:26
 */
@Service
public class JDBCUserDetailService implements UserDetailsService {

	@Autowired
	private CredentialsService credentialsService;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Credentials credentials = credentialsService.findByUserName(userName);
		if (credentials == null) {
			throw new RuntimeException("user is null");
		}
		User user = new User(userName, credentials.getPassword(), credentials.isEnabled(), true, true, true, credentials
				.getAuthorities());

		return user;
	}
}
