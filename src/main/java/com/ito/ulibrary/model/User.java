package com.ito.ulibrary.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "lasst_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Collection<Rol> rol;


    public User(String firstName, String laststName, String email, String password, Collection rol ) {
        this.firstName = firstName;
        this.lastName = laststName;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
}
