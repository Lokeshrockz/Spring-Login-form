package demologform.logform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @RequestMapping("/get")
    public String showHomePage() {
        return "displaying the home page contents";
    }
    @RequestMapping("/protected")
    public String protectedPage() {
        return "displaying the protected page contents";
    }

    @GetMapping("/home")
    public String home()  {
        return ("<h1>Home Page</h1>");
    }
    @GetMapping("/dashboard")
    public String dashboard() {
        return "This is dashboard contents Page";
    }

    @GetMapping("/user")
    public String user()  {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin()  {
        return ("<h1>Welcome Admin</h1>");
    }
}
