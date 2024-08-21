package ideagenerator.repository;
import ideagenerator.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ideagenerator.model.Users;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;


public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("SELECT u FROM Users u")
    List<Users> findAll();
    @Query("SELECT u FROM Users u WHERE u.id = :id")
    Optional<Users> findById(@Param("id") Long id);
    //@Query("SELECT u FROM Users u WHERE u.username = :username")
    //Optional<Users> findByUsername(@Param("username") String username);

    Users findByUsername(String username);
    Users save(UserDto userDto);
}
