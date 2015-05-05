package com.qu;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails{

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String role;
    private String cookie;
    private String history;
    private String note;
    private Date last_time;
    private int first_login_force = 0;
    private int login_count;
    private Date last_chgpwd_time;
    private String email;
    private int pwd_keep_time = 0;
    private String name;
    private String department;
    private String img;
    private String telphone;
    private Integer gender;
    
    private Collection<? extends GrantedAuthority> authorities;
    
    
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getLast_time() {
        return last_time;
    }

    public void setLast_time(Date last_time) {
        this.last_time = last_time;
    }

    public int getFirst_login_force() {
        return first_login_force;
    }

    public void setFirst_login_force(int first_login_force) {
        this.first_login_force = first_login_force;
    }

    public int getLogin_count() {
        return login_count;
    }

    public void setLogin_count(int login_count) {
        this.login_count = login_count;
    }

    public Date getLast_chgpwd_time() {
        return last_chgpwd_time;
    }

    public void setLast_chgpwd_time(Date last_chgpwd_time) {
        this.last_chgpwd_time = last_chgpwd_time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPwd_keep_time() {
        return pwd_keep_time;
    }

    public void setPwd_keep_time(int pwd_keep_time) {
        this.pwd_keep_time = pwd_keep_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}
