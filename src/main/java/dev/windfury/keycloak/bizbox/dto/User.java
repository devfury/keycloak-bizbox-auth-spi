package dev.windfury.keycloak.bizbox.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileTelephoneNumber;
    private String innerTelephoneNumber;
    private String faxTelephoneNumber;
    private List<String> roles;
    public User() {
    }
    public User(
        String username,
        String firstName,
        String lastName,
        String email,
        String mobileTelephoneNumber,
        String innerTelephoneNumber,
        String faxTelephoneNumber,
        List<String> roles
    ) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileTelephoneNumber = mobileTelephoneNumber;
        this.innerTelephoneNumber = innerTelephoneNumber;
        this.faxTelephoneNumber = faxTelephoneNumber;
        // this.roles = roles.stream().map(RoleDTO::getName).collect(Collectors.toList());
        this.roles = roles;
    }
}
