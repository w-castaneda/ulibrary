package com.ito.ulibrary.user.dto;

import com.ito.ulibrary.model.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRegistryDTO {

    private Long id ;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Collection<Rol> rol;

    public UserRegistryDTO(String firstName, String laststName, String email, String password, Collection rol ) {
        this.firstName = firstName;
        this.lastName = laststName;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
    public UserRegistryDTO(String email) {
        this.email = email;
    }
}
