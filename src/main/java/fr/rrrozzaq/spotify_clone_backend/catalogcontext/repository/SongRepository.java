package fr.rrrozzaq.spotify_clone_backend.catalogcontext.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.Song;

public interface SongRepository extends JpaRepository<Song, Long> {

    @Query("SELECT s FROM Song s WHERE lower(s.title) LIKE lower(concat('%',:searchTerm,'%'))" +
            "OR lower(s.author) LIKE lower(concat('%',:searchTerm,'%'))")
    List<Song> findByTitleOrAuthorContaining(String searchTerm);

    Optional<Song> findOneByPublicId(UUID publicId);

    @Query("SELECT s FROM Song s JOIN Favorite f ON s.publicId = f.songPublicId WHERE f.userEmail = :email")
    List<Song> findAllFavoriteByUserEmail(String email);

}