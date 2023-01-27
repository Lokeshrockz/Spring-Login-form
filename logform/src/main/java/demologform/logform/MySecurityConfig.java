package demologform.logform;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter{
    
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests()
            .requestMatchers("/user/home").permitAll()
            .requestMatchers("/user/dashboard").authenticated()
            .and()
            .httpBasic();
            
    }
    
    // protected void configure(AuthenticationManagerBuilder auth ) throws Exception {
    //     auth.inMemoryAuthentication()
    //     .withUser("bushan").password("12345").authorities("admin").and()
    //     .withUser("pavan").password("12345").authorities("user").and()
    //     .passwordEncoder(NoOpPasswordEncoder.getInstance());

    // }

    
    
}
