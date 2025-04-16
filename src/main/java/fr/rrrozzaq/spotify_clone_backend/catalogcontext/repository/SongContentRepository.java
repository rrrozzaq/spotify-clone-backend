package fr.rrrozzaq.spotify_clone_backend.catalogcontext.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.SongContent;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {

    Optional<SongContent> findOneBySongPublicId(UUID publicId);

}