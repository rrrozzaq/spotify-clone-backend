package fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.vo;

import jakarta.validation.constraints.NotBlank;

public record SongTitleVO(@NotBlank String value) {
}