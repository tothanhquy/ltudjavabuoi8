package tothanhqui2080601394.buoi5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tothanhqui2080601394.buoi5.model.Role;

import java.util.Map;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
