package com.Rejbo.Dawid.investmentportfolio.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static com.Rejbo.Dawid.investmentportfolio.security.Constans.SING_UP_URL;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.csrf().disable().authorizeRequests().antMatchers(SING_UP_URL).permitAll();
    }
}
