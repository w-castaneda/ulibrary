package com.ito.ulibrary.service;

import com.ito.ulibrary.model.User;
import com.ito.ulibrary.user.dto.UserRegistryDTO;

public interface UserService {
    public User save(UserRegistryDTO registryDTO);
}
