package fr.rrrozzaq.spotify_clone_backend.catalogcontext.application;

import java.lang.Thread.State;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto.FavoriteSongDTO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto.ReadSongInfoDTO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto.SaveSongDTO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.dto.SongContentDTO;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.mapper.SongContentMapper;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.application.mapper.SongMapper;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.Favorite;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.FavoriteId;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.Song;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.domain.SongContent;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.repository.FavoriteRepository;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.repository.SongContentRepository;
import fr.rrrozzaq.spotify_clone_backend.catalogcontext.repository.SongRepository;
import fr.rrrozzaq.spotify_clone_backend.usercontext.ReadUserDTO;
import fr.rrrozzaq.spotify_clone_backend.usercontext.application.UserService;

@Service
@Transactional
public class SongService {

    private final SongMapper songMapper;

    private final SongRepository songRepository;

    private final SongContentRepository songContentRepository;

    private final SongContentMapper songContentMapper;


    public SongService(SongMapper songMapper, SongRepository songRepository,
            SongContentRepository songContentRepository, SongContentMapper songContentMapper, UserService userService,
            FavoriteRepository favoriteRepository) {
        this.songMapper = songMapper;
        this.songRepository = songRepository;
        this.songContentRepository = songContentRepository;
        this.songContentMapper = songContentMapper;
    }

    public ReadSongInfoDTO create(SaveSongDTO saveSongDTO) {
        Song song = songMapper.saveSongDTOToSong(saveSongDTO);
        Song songSaved = songRepository.save(song);

        SongContent songContent = songContentMapper.saveSongDTOToSong(saveSongDTO);
        songContent.setSong(songSaved);

        songContentRepository.save(songContent);
        return songMapper.songToReadSongInfoDTO(songSaved);
    }
}
