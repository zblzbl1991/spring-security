package com.zbl.auth.model;

import lombok.Data;

import java.util.List;

/**
 * @author zhaobaolong
 * @Title: Credentials
 * @ProjectName demo
 * @Description: 用户Credentials
 * @date 2019/6/2015:32
 */
@Data
public class Credentials {
	private Long id;
	private String userName;
	private String password;
	private Integer version;
	private List<Authority> authorities;
	private boolean enabled;
}
