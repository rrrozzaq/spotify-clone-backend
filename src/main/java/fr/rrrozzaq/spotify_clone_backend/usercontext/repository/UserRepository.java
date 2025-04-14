package fr.rrrozzaq.spotify_clone_backend.usercontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.rrrozzaq.spotify_clone_backend.usercontext.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);

}
