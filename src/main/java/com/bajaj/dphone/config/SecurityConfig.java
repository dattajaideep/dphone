package com.bajaj.dphone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    // @Bean
    // public UserDetailsService userDetailsService() {
    //     UserDetails normalUser = User.
    // }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
                .authorizeHttpRequests()
                // .anyRequest().permitAll()
                .requestMatchers("/public")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                // .formLogin()
                .httpBasic();
        return httpSecurity.build();
        
    }
}
