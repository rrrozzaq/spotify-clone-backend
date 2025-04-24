package fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto.SaveSongDTO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto.SongContentDTO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.SongContent;

@Mapper(componentModel = "spring")
public interface SongContentMapper {

    @Mapping(source = "song.publicId", target = "publicId")
    SongContentDTO songContentToSongContentDTO(SongContent songContent);

    SongContent saveSongDTOToSong(SaveSongDTO songDTO);
}