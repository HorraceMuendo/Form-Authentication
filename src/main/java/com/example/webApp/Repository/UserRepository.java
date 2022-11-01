package com.example.webApp.Repository;

import com.example.webApp.Entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;


@Repository
@Transactional()
public interface UserRepository extends JpaRepository<ApplicationUser,Long> {
    Optional<ApplicationUser> findByEmail(String email);
}
