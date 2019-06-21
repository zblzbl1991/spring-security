package com.zbl.auth.dao;

import com.zbl.auth.model.Authority;
import com.zbl.auth.model.Credentials;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhaobaolong
 * @Title: CredentialsDao
 * @ProjectName demo
 * @Description: TODO
 * @date 2019/6/2016:40
 */
@Repository
public interface CredentialsDao {
	@Select("select * from credentials where name=#{userName}")
	Credentials findByUserName(String userName);
	@Select("select a.* from authority a left join credentials_authorities ca on a.id=ca.authorities_id left join credentials c on c.id=ca.credentials_id\n" +
			"where c.id=#{id}")
	List<Authority> findAuthoritiesByUserId(Long id);
}
