package demologform.logform;

import org.springframework.security.core.userdetails.UserDetailsService;

public class WebSecurityConfigurerAdapter {

    protected UserDetailsService userDetailsService() {
        return null;
    }

}
