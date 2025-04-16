package fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record FavoriteSongDTO(@NotNull boolean favorite, @NotNull UUID publicId) {
}
