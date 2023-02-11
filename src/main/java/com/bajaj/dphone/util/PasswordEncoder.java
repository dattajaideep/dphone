package com.bajaj.dphone.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    } 
}
