package tothanhqui2080601394.buoi5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tothanhqui2080601394.buoi5.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    boolean existsByUsername(String username);
}
