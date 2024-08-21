/*package ideagenerator.UserAuthService;

import ideagenerator.dto.UserDto;
import ideagenerator.model.Users;
import ideagenerator.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    PasswordEncoder passwordEncoder;

    private UsersRepository userRepository;

    public UserServiceImpl(UsersRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public Users findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Users save(UserDto userDto) {
        Users user = new Users(userDto.getUsername(), passwordEncoder.encode(userDto.getPassword()));
        return userRepository.save(user);
    }

}*/
