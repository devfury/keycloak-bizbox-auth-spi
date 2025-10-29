package dev.windfury.keycloak.bizbox.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponseDTO {
    @JsonProperty("startCount")
    private int startCount;

    @JsonProperty("totalCount")
    private int totalCount;

    @JsonProperty("list")
    private List<UserMemberDTO> list;
}
