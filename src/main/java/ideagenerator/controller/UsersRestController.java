/*package ideagenerator.controller;

import org.springframework.ui.Model;
import ideagenerator.model.Users;
import ideagenerator.repository.UsersRepository;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UsersRestController {


    private final UsersRepository usersRepository;

    public UsersRestController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("")
    public String allUsers(Model model, HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/login";
        }
        List<Users> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "allUsers";
    }
    @PostMapping("searchById")
    public String userById(@RequestParam("id") Long id, Model model) {
        Optional<Users> userOptional = usersRepository.findById(id);
        if (userOptional.isPresent()) {
            model.addAttribute("user", userOptional.get());
        } else {
            model.addAttribute("error", "User not found with id: " + id);
        }
        return "userDetails";
    }
}*/