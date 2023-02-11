package com.bajaj.dphone.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private int points = 0;
    private String code;

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", points="
                + points + "]";
    }
    public int getId() {
        return id;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return this.name;
    }
    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true ;
    }
    
}
