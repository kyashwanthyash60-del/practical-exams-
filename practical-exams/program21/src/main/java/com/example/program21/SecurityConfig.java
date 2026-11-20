package com.example.program21;
import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;import org.springframework.security.crypto.factory.PasswordEncoderFactories;import org.springframework.security.crypto.password.PasswordEncoder;import org.springframework.security.web.SecurityFilterChain;
@Configuration public class SecurityConfig{
@Bean PasswordEncoder passwordEncoder(){return PasswordEncoderFactories.createDelegatingPasswordEncoder();}
@Bean UserDetailsService users(PasswordEncoder encoder){return new InMemoryUserDetailsManager(User.withUsername("student").password(encoder.encode("student123")).roles("USER").build(),User.withUsername("admin").password(encoder.encode("admin123")).roles("ADMIN").build());}
@Bean SecurityFilterChain filter(HttpSecurity http)throws Exception{return http.csrf(csrf->csrf.disable()).authorizeHttpRequests(auth->auth.requestMatchers("/public").permitAll().anyRequest().authenticated()).httpBasic(Customizer.withDefaults()).build();}
}
