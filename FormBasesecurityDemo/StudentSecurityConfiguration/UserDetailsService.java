package com.example.FormBasesecurityDemo.StudentSecurityConfiguration;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsService {

    UserDetails loadUserByUsername(String username) ;
}
