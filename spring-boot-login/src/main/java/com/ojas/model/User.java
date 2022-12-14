package com.ojas.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String userName;
private String password;
@Transient
private String passwordConfirm;
@ManyToMany
private Set<Role> roles;

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getUsername() {
    return userName;
}

public void setUsername(String username) {
    this.userName = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getPasswordConfirm() {
    return passwordConfirm;
}

public void setPasswordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
}

public Set<Role> getRoles() {
    return roles;
}

public void setRoles(Set<Role> roles) {
    this.roles = roles;
}
}
