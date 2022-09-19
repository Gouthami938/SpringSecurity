package com.example.FormBasesecurityDemo.StudentSecurityConfiguration;

import com.example.FormBasesecurityDemo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;



@Configuration
@EnableWebSecurity
public class StudentConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
 PasswordEncode pwd;


//    @Resource
//    UserDetailsService userDetailsService;
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {

//        http
//                .authorizeRequests()
//                //antMatcher is like regular expression (in matches accordingly
//                .antMatchers("/","index","/css/*","/js/*")
//                .permitAll()
//                //it permits wat ever there in antMatcher
//              //  .authenticated()
//               // .anyRequest()
//              //  .authenticated()
//                .and()
//                .rememberMe().userDetailsService(userDetailsService)
//                .and()
//              //  .httpBasic();//ur adding basic type of authentication(similar to alert)
//                .formLogin(form->form
//                        .defaultSuccessUrl("/Student/hi")
//                        .failureUrl("/Student/unsuccess"));
//
//
//    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin/login").hasRole("ADMIN")
                .antMatchers("/Student/hi").hasRole("USER")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

    }
    @Override
    protected void configure(AuthenticationManagerBuilder Student) throws Exception {
        Student
                .inMemoryAuthentication()
                .withUser("gouthami").password(pwd.passwordEncoder().encode("1234")).roles("ADMIN")
                .and()
                .withUser("ammulu").password(pwd.passwordEncoder().encode("hi@1234")).roles("USER");
    }



}

















