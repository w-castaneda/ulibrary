package com.ito.ulibrary.service;

import com.ito.ulibrary.model.Rol;
import com.ito.ulibrary.model.User;
import com.ito.ulibrary.repository.UserRepository;
import com.ito.ulibrary.user.dto.UserRegistryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserRegistryDTO registryDTO) {
        User user = new User(registryDTO.getFirstName(), registryDTO.getLastName(), registryDTO.getEmail(), registryDTO.getPassword(),
                Arrays.asList(new Rol("ROLE_USER")));
        return userRepository.save(user);
    }
}