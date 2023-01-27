package newloginpage.loginpageform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import jakarta.validation.Valid;


@Controller
public class LoginController<LoginBean>  {

    private boolean getUserName;
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
    }

    @GetMapping("/")
    public String showForm(LoginForm loginForm) {
        return "login";
    }
    
    @PostMapping("/")
    public String validateLoginInfo(Model model, @Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        model.addAttribute("user", loginForm.getuserName());
        return "home";
    }
}
    

