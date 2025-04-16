package fr.rrrozzaq.spotify_clone_backend.catalogcontext.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.Favorite;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.FavoriteId;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
    List<Favorite> findAllByUserEmailAndSongPublicIdIn(String email, List<UUID> songPublicIds);
}