package ideagenerator.dto;

public class UserDto {

    private String username;
    private String password;
    private boolean active;

    public UserDto(String username, String password, boolean active) {
        super();
        this.username = username;
        this.password = password;
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "UserDto [username=" + username + ", password=" + password + ", active=" + active + "]";
    }
}
