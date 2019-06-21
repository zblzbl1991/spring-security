package com.zbl.auth.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

/**
 * @author zhaobaolong
 * @Title: Authority
 * @ProjectName demo
 * @Description: 用户权限实体类
 * @date 2019/6/2016:26
 */
@Data
public class Authority  implements GrantedAuthority,Serializable {
	private Long id;
	private String authority;
	@Override
	public String getAuthority() {
		return authority;
	}
}
