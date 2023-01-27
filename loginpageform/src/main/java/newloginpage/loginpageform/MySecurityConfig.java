package newloginpage.loginpageform;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class MySecurityConfig extends WebMvcConfigurerAdapter{
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
            .requestMatchers("/home").permitAll()
            .and()
            .httpBasic();
    }
    
}
