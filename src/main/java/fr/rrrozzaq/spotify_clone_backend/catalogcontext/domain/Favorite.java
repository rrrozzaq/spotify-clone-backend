package fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "favorite_song")
@IdClass(FavoriteId.class)
public class Favorite implements Serializable {

    @Id
    private UUID songPublicId;

    @Id
    @Column(name = "user_email")
    private String userEmail;

    public UUID getSongPublicId() {
        return songPublicId;
    }

    public void setSongPublicId(UUID songPublicId) {
        this.songPublicId = songPublicId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
