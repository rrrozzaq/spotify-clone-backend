package fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.vo;

import jakarta.validation.constraints.NotBlank;

public record SongAuthorVO(@NotBlank String value) {
}