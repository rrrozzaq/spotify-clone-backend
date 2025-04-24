package fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto.ReadSongInfoDTO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto.SaveSongDTO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.vo.SongAuthorVO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.vo.SongTitleVO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.Song;

@Mapper(componentModel = "spring")
public interface SongMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "publicId", ignore = true)
    Song saveSongDTOToSong(SaveSongDTO saveSongDTO);

    @Mapping(target = "favorite", ignore = true)
    ReadSongInfoDTO songToReadSongInfoDTO(Song song);

    default SongTitleVO stringToSongTitleVO(String title) {
        return new SongTitleVO(title);
    }

    default SongAuthorVO stringToSongAuthorVO(String author) {
        return new SongAuthorVO(author);
    }

    default String songTitleVOToString(SongTitleVO title) {
        return title.value();
    }

    default String songAuthorVOToString(SongAuthorVO author) {
        return author.value();
    }

}
