package ci.digitalacademy.monetab.services.mapper.impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.dto.UserDTO;

public interface UserMapper extends EntityMapper<UserDTO, User> {


    UserDTO toDto(User entity);

    User toEntity(UserDTO dto);
}
