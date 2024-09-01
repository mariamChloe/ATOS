package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
//import jdk.internal.org.jline.utils.Log;
import ci.digitalacademy.monetab.services.dto.UserDTO;
import ci.digitalacademy.monetab.services.mapper.impl.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        user = userRepository.save(user);

        return userMapper.toDto(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public UserDTO update(UserDTO userDTO) {

        return null; //enregistrement de l'utilisateur


    }
    @Override
    public Optional<UserDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public void delecte(Long id) {

    }


}

