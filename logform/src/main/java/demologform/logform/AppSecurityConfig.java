// package demologform.logform;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.password.NoOpPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;

// @Configuration
// @EnableWebSecurity
// public class AppSecurityConfig extends WebSecurityConfigurerAdapter{
   
//     @Bean
//     public UserDetailsService userDetailsService() {
//         List<UserDetails> users = new ArrayList<>();
//         users.add(User.withDefaultPasswordEncoder().username("Lokesh")
//           .password("java").roles("user").build());
//         users.add(User.withDefaultPasswordEncoder().username("Arav")
//           .password("javaspring").roles("admin").build());
          
    
//     return new InMemoryUserDetailsManager(users);
    
// }
// public void configure(HttpSecurity http) throws Exception{
//     http.authorizeHttpRequests()
//         .requestMatchers("/user").permitAll()
//         .requestMatchers("/admin").denyAll()
//         .and()
//         .httpBasic();
       
// }


//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//     InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//     UserDetails user1 = User.withUsername("Lokesh").password("12345").authorities("admin").build();
//     UserDetails user2 = User.withUsername("arav").password("12345").authorities("user").build();
//     userDetailsService.createUser(user1);
//     userDetailsService.createUser(user2);
//     auth.userDetailsService(null);

//  }

//  @Bean
//   public PasswordEncoder passwordEncoder() {
//     return NoOpPasswordEncoder.getInstance();
//   }
// }
