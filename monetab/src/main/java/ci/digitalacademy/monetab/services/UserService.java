package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);

    UserDTO save(UserDTO userDTO);

    User update(User user);

    UserDTO update(UserDTO userDTO);


    Optional<UserDTO> findOne(Long id);

    List<UserDTO> findAll();

    void delecte(Long id);
}
