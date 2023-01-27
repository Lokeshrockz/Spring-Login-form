package newloginpage.loginpageform;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginForm {
    @NotNull
    @Size(min = 5, max = 10)
    private String userName;

    @NotNull
    @Min(8)
    private String password;

    public String getuserName() {
        return this.userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "LoginForm(UserName: " + this.userName + ", Password: " + this.password + ")";
    }
}
