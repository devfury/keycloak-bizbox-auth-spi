package com.example.keycloak.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class UserResponseDTO {
    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("username")
    private String username;
    @JsonProperty("email")
    private String email;
    @JsonProperty("creationDatetime")
    private String creationDatetime;
    @JsonProperty("lastUpdateDatetime")
    private String lastUpdateDatetime;
    @JsonProperty("roles")
    private List<String> roles;
    // private List<RoleDTO> roles;

}
