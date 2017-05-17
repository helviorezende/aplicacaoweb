package org.wpattern.spring.oauth2.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.wpattern.spring.oauth2.utils.BaseEntity;

@Entity
@Table(name = "tb_user")
public class UserEntity extends BaseEntity<Long> {
	private String name;
	private String email;
	private String password;

	public UserEntity() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}