package fr.rrrozzaq.spotify_clone_backend.usercontext.mapper;

import org.mapstruct.Mapper;

import fr.rrrozzaq.spotify_clone_backend.usercontext.ReadUserDTO;
import fr.rrrozzaq.spotify_clone_backend.usercontext.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);

}
